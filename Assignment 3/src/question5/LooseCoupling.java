package question5;

interface Shape {
	  void draw();
	}

	class Circle implements Shape {
	  @Override
	  public void draw() {
	    System.out.println("Drawing a circle");
	  }
	}

	class Square implements Shape {
	  @Override
	  public void draw() {
	    System.out.println("Drawing a square");
	  }
	}

	public class LooseCoupling {

	  public static void main(String[] args) {
	    Shape shape = new Circle();
	    shape.draw();

	    shape = new Square();
	    shape.draw();
	  }
	}
