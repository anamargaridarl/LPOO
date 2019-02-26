import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private int width;
    private int height;
    private List<Wall> walls;
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

    public Arena(int width, int height)
    {
        this.walls = createWalls();
        hero = new Hero();
        this.height = height;
        this.width = width;
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#48D1CC"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');

        for (Wall wall : walls)
            wall.draw(graphics);

        hero.draw(graphics);
    }

    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    private boolean canHeroMove(Position position) {
        return position.getX() <= width && position.getY() <= height;
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

}
