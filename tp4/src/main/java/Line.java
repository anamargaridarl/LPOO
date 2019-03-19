public class Line implements Shape {

    private double lenght;

    public Line(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String draw() {
        return "Line";
    }

}
