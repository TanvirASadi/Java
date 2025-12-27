package loops;

public class WhileLoop {
	
    public static void main(String[] args) {
        int count = 1; // Initialize a counter variable

        // The while loop continues as long as 'count' is less than or equal to 5
        while (count <= 5) {
            System.out.println("Current count: " + count); // Print the current value of count
            count++; // Increment the counter
        }

        System.out.println("Loop finished. Final count: " + count);
    }

}
