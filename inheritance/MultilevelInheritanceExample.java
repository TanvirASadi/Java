package inheritance;

//Grandparent class
class Vehicle {
 public void displayVehicleType() {
     System.out.println("This is a generic Vehicle.");
 }
}

//Parent class (inherits from Vehicle)
class FourWheeler extends Vehicle {
 public void displayWheels() {
     System.out.println("This vehicle has 4 wheels.");
 }
}

//Child class (inherits from FourWheeler, and implicitly from Vehicle)
class Car extends FourWheeler {
 public void displayCarDetails() {
     System.out.println("This 4 wheeler is a Car.");
 }
}

//Main class to run the program
public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     // Create an object of the child class (Car)
     Car myCar = new Car();

     // Call methods from all three levels using the child object
     System.out.println("Accessing methods from all levels:");
     myCar.displayVehicleType(); // Method from Grandparent (Vehicle)
     myCar.displayWheels();      // Method from Parent (FourWheeler)
     myCar.displayCarDetails();  // Method from Child (Car)
 }
}