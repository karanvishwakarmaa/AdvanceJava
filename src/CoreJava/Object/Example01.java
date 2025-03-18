package CoreJava.Object;

import java.util.Scanner;

class Calculator{
    public int add(int a, int b) {
        return a + b;
    }
}

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        int sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
