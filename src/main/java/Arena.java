import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {

    private int width;
    private int height;
    private List<Wall> walls;
    private List<Coin> coins;
    Monster monster;
    Hero hero;


    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }

        return walls;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            coins.add(new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
        return coins;
    }

    public Arena(int width, int height)
    {
        hero = new Hero();
        this.height = height;
        this.width = width;
        this.walls = createWalls();
        this.coins = createCoins();
        monster = new Monster(1,1);
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#48D1CC"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');

        for (Wall wall : walls)
            wall.draw(graphics, "#8B4513", "W");

        for (Coin coin : coins)
            coin.draw(graphics, "#ff00ff", "O");

        hero.draw(graphics,"#FFFF33", "X");

        monster.draw(graphics,"#ff0000","P" );

    }

    public void moveHero(Position position) {

        if (canMove(position))
            hero.setPosition(position);
    }

    public void moveMonster()
    {
        Position position = monster.move();

        if(canMove(position))
            monster.setPosition(position);

    }

    public boolean verifyMonsterCollisions()
    {
        if(monster.getPosition().equals(hero.getPosition()))
            return true;
        else
            return false;
    }

    private boolean canMove(Position position) {

        for (Wall wall : walls) {
            if (wall.getPosition().equals(position))
                return false;
        }

        for (Coin coin : coins) {
            if (coin.getPosition().equals(position)) {
                retrieveCoins(coin);
                return false;
            }
        }

        return true;
    }

    public Position moveRight()
    {
        return hero.moveRight();
    }

    public Position moveLeft()
    {
        return hero.moveLeft();
    }
    public Position moveUp()
    {
        return hero.moveUp();
    }
    public Position moveDown()
    {
        return hero.moveDown();
    }

    public void retrieveCoins(Coin coin)
    {
        coins.remove(coin);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
