package objects;


/*
 * This program is to demonstrate how classes is created and an object is created for that class.
 * For the simplicity of understanding the main method is used in the same class, however in real
 * life scenario a main method will be used in another class. NOTE: if the class is used resides
 * within the same package, then you don't have to import the class. IF class resides in another 
 * package from where the main method is created, you will need to import that class.
 * example:
 * 			import packageName.className;
 */

//Define a class named 'Car'
public class Car {
			 // Data members (properties) of the Car class
			 String make;
			 String model;
			 int year;
			
			 // Method (behavior) of the Car class
			 void startEngine() {
			     System.out.println(make + " " + model + "'s engine started.");
			 }
			
			 void drive() {
			     System.out.println(make + " " + model + " is driving.");
			 }
	 
	 
			 public static void main(String[] args) {
			   // Create an object (instance) of the Car class
			   Car myCar = new Car();
		
			   // Assign values to the object's properties
			   myCar.make = "Toyota";
			   myCar.model = "Camry";
			   myCar.year = 2023;
		
			   // Call the object's methods
			   myCar.startEngine();
			   myCar.drive();
		
			   // Create another object of the Car class
			   Car yourCar = new Car();
			   yourCar.make = "Honda";
			   yourCar.model = "Civic";
			   yourCar.year = 2024;
		
			   yourCar.startEngine();
			   yourCar.drive();
			 }
}
