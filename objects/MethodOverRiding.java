package objects;

//Parent Class (Superclass)
class Animal {
 public void sound() {
     System.out.println("Animal makes a general sound");
 }
}

//Child Class (Subclass)
class Dog extends Animal {
 // The @Override annotation is good practice to ensure the method is indeed overriding
 // a parent method and to get a compile-time check.
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Main class to demonstrate the overriding
public class MethodOverRiding {
 public static void main(String[] args) {
     Animal genericAnimal = new Animal();
     Animal specificDog = new Dog(); // Polymorphism in action

     // Calls the sound() method of the Animal class
     genericAnimal.sound(); 

     // Calls the *overridden* sound() method of the Dog class 
     // at runtime, based on the actual object type.
     specificDog.sound(); 
 }
}


