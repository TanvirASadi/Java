package programmingBasics;

/*
 * Data Types: generally two types.
 * 1. Primitive data types includes
 * - Byte
 * - Short 
 * - Int 
 * - Long
 * - Float
 * - Double
 * - Char
 * - Boolean
 * 2. Non-primitive/derived data types
 * - String
 * - ArrayList
 * - Hashset
 * - Hashmap etc.
 * 
 * you must declare the data type before assigning data to a variable.
 * example:
 *    int a; <-----declaration
 *    a = 100 <----assignment
 *    
 *    Char is represented with a single quotation ' '.
 *    String is represented with a double quotation " ".
 * 
 */

public class PrimitiveDataTypes {
	
	// the following example demonstrates how to declare and assign data to a variable.
	
	public static void main(String[] args) {
		String nameString = "Tanvir";
		int age = 30;
		double salary = 15.25;
		
		System.out.println("The name of this employee is " + nameString + ", he is " + age + "\n and his salary is + " + salary);
	}

}
