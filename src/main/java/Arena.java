import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Arena {

    private int width;
    private int height;
    Hero hero;

    public Arena(int width, int height)
    {
        hero = new Hero();
        this.height = height;
        this.width = width;
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#48D1CC"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');

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
