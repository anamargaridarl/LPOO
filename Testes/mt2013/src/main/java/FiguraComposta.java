public class FiguraComposta extends Figura implements Countable {


    private Figura[] figuras;

    public FiguraComposta(Figura[] figuras) {
        super();
        this.figuras = figuras;
    }

    public double getPerimetro()
    {
        double s = 0;
        for(Figura f: figuras)
            s += f.getPerimetro();

        return s;
    }

    public double getArea()
    {
        double s = 0;
        for(Figura f: figuras)
            s += f.getArea();

        return s;
    }

    public int count()
    {
        return figuras.length;
    }
}
