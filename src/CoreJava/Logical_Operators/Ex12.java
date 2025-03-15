package CoreJava.Logical_Operators;

public class Ex12 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND operator
        System.out.println("x AND y: " + (x && y));  // Output: false

        // Logical OR operator
        System.out.println("x OR y: " + (x || y));  // Output: true

        // Logical NOT operator
        System.out.println("NOT x: " + (!x));  // Output: false

        // Logical XOR operator
        System.out.println("x XOR y: " + (x ^ y));  // Output: true
    }
}
