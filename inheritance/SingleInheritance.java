package inheritance;

	// Superclass (Parent Class)
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Subclass (Child Class) - inherits from Animal using 'extends'
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	// Main class to test the inheritance
	public class SingleInheritance {
	    public static void main(String[] args) {
	        // Create an object of the subclass (Dog)
	        Dog myDog = new Dog();

	        // Call the method defined in the subclass
	        myDog.bark(); // Output: The dog barks.

	        // Call the method inherited from the superclass (Animal)
	        myDog.eat(); // Output: This animal eats food.
	    }
	}

