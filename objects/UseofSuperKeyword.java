package objects;

//Superclass (Parent)
class Animals {
 public void sound() {
     System.out.println("The animal makes a generic sound.");
 }
}

//Subclass (Child)
class Dogs extends Animals {
 // Override the sound method in the subclass
 @Override
 public void sound() {
     // Call the sound() method of the superclass using super
     super.sound(); 
     System.out.println("The dog says: bow wow.");
 }
}

//Main class to run the example
public class UseofSuperKeyword {
 public static void main(String args[]) {
     Dogs myDog = new Dogs(); // Create a Dog object
     myDog.sound(); // Call the overridden method on the Dog object
 }
}



