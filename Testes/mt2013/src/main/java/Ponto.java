public class Ponto implements Comparable {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString()
    {
        return "("+ x + ", "+ y +")";
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)return true;

        if(this==null)return false;

        if(this.getClass() != o.getClass()) return false;

        Ponto p = (Ponto)o;

        return (p.x == this.x && p.y == this.y);


    }


    @Override
    public int compareTo(Object o) {

        Ponto p = (Ponto)o;

        if (this.x > p.x)
            return 1;
        else if (this.x < p.x)
            return -1;
        else if(this.x == p.x)
        {
            if(this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else if (this.y == p.y)
                return 0;
        }

        return 0;
    }
}
