package programmingBasics;

import java.util.Scanner;

public class ControlStatementSwitchCase {
	
	//This program demonstrates how to use a switch case.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for the day of the week you wish to search: ");
		int dayNum = scanner.nextInt();
		
		switch (dayNum) {
		case 1:
			System.out.println("It's Sunday!");			
			break;
		case 2: 
			System.out.println("It's Monday");
			break;
		case 3:
			System.out.println("It's Tuesday!");			
			break;
		case 4: 
			System.out.println("It's Wednesday!");
			break;
		case 5:
			System.out.println("It's Thursday!");			
			break;
		case 6: 
			System.out.println("It's Friday!");
			break;
		case 7:
			System.out.println("It's Saturday!");			
			break;
		default:
			System.out.println("Invalid entry! Try again.");
			break;
		}
		scanner.close();
	}

}
