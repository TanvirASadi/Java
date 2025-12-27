package arrys;

public class ArraySingleDimensional {
	
	   public static void main(String[] args) {
	        // 1. Declaration and Initialization using an array literal
	        // This declares an array of Strings and initializes it with values directly.
	        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

	        // 2. Declaration and Initialization with a specified size
	        // This declares an array of integers and allocates space for 3 elements.
	        // The elements are initialized to default values (0 for int).
	        int[] numbers = new int[3];

	        // 3. Assigning values to elements using their index
	        numbers[0] = 10;
	        numbers[1] = 20;
	        numbers[2] = 30;

	        // 4. Accessing and printing elements
	        System.out.println("Fruits in the array:");
	        for (int i = 0; i < fruits.length; i++) {
	            System.out.println("Fruit at index " + i + ": " + fruits[i]);
	        }

	        System.out.println("\nNumbers in the array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Number at index " + i + ": " + numbers[i]);
	        }

	        // 5. Modifying an element
	        fruits[1] = "Blueberry";
	        System.out.println("\nModified fruit at index 1: " + fruits[1]);
	        
	        
	    }

}
