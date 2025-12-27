package programmingBasics;

import java.util.Scanner;
/*
 * This program demonstrated how to use Scanner class object 
 * to receive input from the keyboard. 
 */
public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Creation of scanner class object
		System.out.println("Enter your name: ");
		String nameString = scanner.nextLine();   // Assigning input to a string variable
		
		System.out.println("You entered: \"" + nameString + "\"");
		scanner.close(); // Best practice to close scanner object at the end of the program.
		
	}

}
