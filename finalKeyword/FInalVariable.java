package finalKeyword;




public class FInalVariable{
    public static void main(String[] args) {
        final double PI = 3.14159; // PI is a constant

        System.out.println("Value of PI: " + PI);

        // If you try to reassign PI, it results in a compilation error:
        // PI = 3.14; // ERROR: cannot assign a value to final variable PI
    }
}


