package loops;

public class EnhancedForLoop {
	  public static void main(String[] args) {
		  
	        // Declare and initialize an array of integers
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Use an enhanced for loop to iterate through the array
	        System.out.println("Elements of the array:");
	        for (int number : numbers) {
	            System.out.println(number);
	        }

	        // Declare and initialize a List of Strings
	        java.util.List<String> fruits = new java.util.ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        // Use an enhanced for loop to iterate through the List
	        System.out.println("\nElements of the List:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }

}
