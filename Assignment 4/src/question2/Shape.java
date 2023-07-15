package question2;

abstract class Shape {
	  public abstract void draw();
	  public abstract void area();

	  public void concreteMethod1() {
	    System.out.println("This is a concrete method");
	  }

	  public void concreteMethod2() {
	    System.out.println("This is another concrete method");
	  }
	}
