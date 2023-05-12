public class main {
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        Parallelogram parallelogram = new Parallelogram(6, 4, 5);
        System.out.println("\nParallelogram:");
        System.out.println("Area: " + parallelogram.area());
        System.out.println("Perimeter: " + parallelogram.perimeter());

        Square square = new Square(3);
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());

        Rhombus rhombus = new Rhombus(4, 5);
        System.out.println("\nRhombus:");
        System.out.println("Area: " + rhombus.area());
        System.out.println("Perimeter: " + rhombus.perimeter());

        Trapezoid trapezoid = new Trapezoid(5, 7, 4, 3, 4);
        System.out.println("\nTrapezoid:");
        System.out.println("Area: " + trapezoid.area());
        System.out.println("Perimeter: " + trapezoid.perimeter());
    }
}
