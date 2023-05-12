public class Parallelogram extends Quadrilateral {
    private double base;
    private double height;

    public Parallelogram(double base, double side, double height) {
        super(new double[]{base, side, base, side});
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height;
    }
}
