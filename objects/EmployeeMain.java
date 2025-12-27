package objects;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.id = 101;
		employee.nameString = "Sadi";
		employee.salary = 25.20;
		
		employee.display();
	}

}
