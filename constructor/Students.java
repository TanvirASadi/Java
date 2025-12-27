package constructor;

public class Students {
	
	int sID;
	String sNameString;
	char sGrade;
	
	
	//Parameterized constructor
	public Students(int sID, String sNameString, char sGrade) {
		this.sID = sID;
		this.sNameString = sNameString;
		this.sGrade = sGrade;

	}
	
	public void display() {
		System.out.println("Student's ID is: " + sID);
		System.out.println("Student's name is: " + sNameString);
		System.out.println("Student's grade is: " + sGrade);
	}

}
