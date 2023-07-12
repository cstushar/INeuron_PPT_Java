
class ShapeCalculator {
	
	public void printArea(Rectangle rectangle) {
		 double area = rectangle.calculateArea();
	     System.out.println("Area: " + area);
	}
	
	public void printArea(Circle circle) {
		 double area = circle.calculateArea();
	     System.out.println("Area: " + area);
	}
	
	public void printArea(Triangle triangle) {
		 double area = triangle.calculateArea();
	     System.out.println("Area: " + area);
	}
}
