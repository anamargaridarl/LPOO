public class Circulo extends Figura {
    private Ponto p;
    private int raio;

    public Circulo(Ponto p, int raio) throws IllegalArgumentException{
        this.p = p;

        if(raio <= 0)
            throw new IllegalArgumentException();
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return p;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(raio,2);
    }

    public double getPerimetro()
    {
        return 2* Math.PI * raio;
    }
}
