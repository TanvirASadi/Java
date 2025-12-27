package encapsulation;


// This program demonstrates how to use setters and getters. It is the best practice to 
// use setters and getters to protect the data. variables always should stay private.

public class Student {
	
	private int studentID;
	private String studentNameString;
	private double studentGPA;
	
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setStudentNameString(String studentNameString) {
		this.studentNameString = studentNameString;
	}
	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getStudentNameString() {
		return studentNameString;
	}
	public double getStudentGPA() {
		return studentGPA;
	}
	
	void display() {
		System.out.println("Student's id is: " + studentID);
		System.out.println("Student's name is: " + studentNameString);
		System.out.println("Student's GPA is: " + studentGPA);
		
	}

}
