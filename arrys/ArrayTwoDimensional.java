package arrys;

public class ArrayTwoDimensional {
	
    public static void main(String[] args) {
        // Declare and initialize a 2D integer array (3 rows, 3 columns)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print a specific element
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Outputs 6

        // Iterate through the array and print all elements
        System.out.println("\nAll elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
