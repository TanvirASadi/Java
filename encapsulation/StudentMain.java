package encapsulation;

public class StudentMain {
	
	public static void main(String[] args) {
		
		//Creating an object of the Students Class. It require to send three arguments.
		Student students = new Student();
		students.setStudentID(2001);
		students.setStudentNameString("Mishty");
		students.setStudentGPA(3.6);
		
		// students.display();		// Display method is executed from Students class.
		
		System.out.println("Student's id is: " + students.getStudentID());
		System.out.println("Student's name is: " + students.getStudentNameString());
		System.out.println("Student's GPA is: " + students.getStudentGPA());
	}

}
