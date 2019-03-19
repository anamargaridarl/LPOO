public class Ellipse implements AreaShape {
    private double xradius;
    private double yradius;


    public Ellipse(double xradius, double yradius) {
        this.xradius = xradius;
        this.yradius = yradius;
    }

    public double getXradius()
    {
        return xradius;
    }

    public double getYradius()
    {
        return yradius;
    }

    @Override
    public double getArea() {
        return Math.PI * xradius* yradius;
    }

    @Override
    public String draw() {
        return "Ellipse";
    }
}
