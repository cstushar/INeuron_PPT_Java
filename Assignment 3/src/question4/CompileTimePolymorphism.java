package question4;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();

		shape = new Square();
		shape.draw();
	}
}
