public abstract class Quadrilateral {
    protected double[] sides;

    public Quadrilateral(double[] sides) {
        this.sides = sides;
    }

    public double perimeter() {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return sum;
    }

    public abstract double area();
}
