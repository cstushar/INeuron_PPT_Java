package question1;

public class InterfaceExample {

  public static void main(String[] args) {
    Shape shape = new Circle();
    shape.draw();

    shape = new Square();
    shape.draw();
  }
}
