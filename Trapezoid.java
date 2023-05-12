public class Trapezoid extends Quadrilateral {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height, double side1, double side2) {
        super(new double[]{base1, side1, base2, side2});
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double area() {
        return 0.5 * (base1 + base2) * height;
    }
}
