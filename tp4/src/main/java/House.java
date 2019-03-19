public class House implements HasArea {

    private double height;
    private double width;

    public House(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }
}
