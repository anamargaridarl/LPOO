import java.util.concurrent.ThreadLocalRandom;

public class Monster extends Element {

    public Monster(int x, int y)
    {
        position = new Position(x,y);
    }
    public Position move()
    {
        Position p = new Position(1,1);
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);

        switch(randomNum)
        {
            case 1: {
                p.setX(position.getX() + 1);
                p.setY(position.getY() + 1);
                break;
            }
            case 2: {
                p.setY(position.getY() + 1);
                break;
            }
            case 3: {
                p.setX(position.getY() + 1);
                break;
            }
            case 4: {
                p.setX(position.getX() - 1);
                p.setY(position.getY() - 1);
                break;
            }
            case 5: {
                p.setY(position.getY() - 1);
                break;
            }
            case 6: {
                p.setX(position.getY() - 1);
                break;
            }
        }


        return p;

    }


}

