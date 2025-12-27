package constructor;

public class StudentMain {
	
	public static void main(String[] args) {
		
		//Creating an object of the Students Class. It require to send three arguments.
		Students students = new Students(10001, "Mishty", 'A');
		students.display();		// Display method is executed from Students class.
	}

}
