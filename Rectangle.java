public class Rectangle extends Quadrilateral {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
