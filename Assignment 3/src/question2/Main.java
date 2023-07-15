package question2;

public class Main {

	public static void main(String[] args) {
		
		//This type of object declaration is known as loose coupling
		ParentClass obj = new ChildClass();
		
		// This method call calls the child class function which is override
		obj.method();
	}

}
