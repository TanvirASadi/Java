package loops;

public class DoWhileLoop {

	/*
	 * The code inside the do block is executed at least once. 
	 * In this case, System.out.println(i) prints the current
	 *  value of i, and i++ increments i by 1.
	 */
	
    public static void main(String[] args) {
        int i = 1; // Initialize the counter

        do {
            System.out.println(i); // Execute the loop body
            i++; // Increment the counter
        } while (i <= 5); // Check the condition
    }
}
