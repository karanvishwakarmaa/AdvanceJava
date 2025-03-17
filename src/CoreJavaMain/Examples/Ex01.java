package CoreJavaMain.Examples;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a;
        int b;
        a = 10;
        b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        double average = (double) (a + b) / 2;
        System.out.println("Average: " + average);
        int product = a * b;
        System.out.println("Product: " + product);
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
        boolean isEqual = a == b;
        System.out.println("Is equal: " + isEqual);
        boolean isNotEqual = a != b;
        System.out.println("Is not equal: " + isNotEqual);
    }
}
