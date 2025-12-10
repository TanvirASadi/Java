package programmingBasics;

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
