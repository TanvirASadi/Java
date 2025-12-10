package programmingBasics;

/*
 * This program demonstrates how a nested if else is used to filter through various conditions.
 */
public class ControlStatementNestedIFElse {
	
	public static void main(String[] args) {
		
		int score = 67;
		
		if (score>60) {
			if(score >60 && score <= 70) {
				System.out.println("You scored a D");
			}
			else if (score >70 && score <=80) {
				System.out.println("You score a C");
			}
			else if (score >80 && score <=90) {
				System.out.println("You scored a B");
			}
			else if (score > 90 && score <= 100){
				System.out.println("You scored an A");
			}
		}
		
		else {
			System.out.println("You received an F");
		}
	}

}
