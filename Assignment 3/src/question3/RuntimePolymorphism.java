package question3;

public class RuntimePolymorphism {

	  public static void main(String[] args) {
	    Animal animal = new Animal();
	    animal.speak();

	    Animal dog = new Dog();
	    dog.speak();

	    Animal cat = new Cat();
	    cat.speak();
	  }
	}