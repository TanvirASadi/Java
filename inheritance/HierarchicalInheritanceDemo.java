package inheritance;

class Vehicles {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Child class 1 (Subclass)
class Cars extends Vehicles {
    public void drive() {
        System.out.println("The car is driving.");
    }
}

// Child class 2 (Subclass)
class Bike extends Vehicles {
    public void ride() {
        System.out.println("The bike is riding.");
    }
}

// Main class to test the inheritance
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Create objects of the child classes
        Cars myCar = new Cars();
        Bike myBike = new Bike();

        // Both child classes can access the 'move()' method from the parent class
        myCar.move();
        myBike.move();

        // Each child class can also use its own unique methods
        myCar.drive();
        myBike.ride();
    }
}