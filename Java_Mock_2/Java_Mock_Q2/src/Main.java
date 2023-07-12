
public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 8);

        calculator.printArea(rectangle);
        calculator.printArea(circle);
        calculator.printArea(triangle);
    }
}
