package CoreJava.Object;

import java.util.Scanner;

class Add{
    int add(int a, int b){
        return a + b;
    }
}

class Subtract{
    int subtract(int a, int b){
        return a - b;
    }
}

class Multiply{
    int multiply(int a, int b){
        return a * b;
    }
}

class Divide{
    double divide(int a, int b){
        return (double) a / b;
    }
}

public class Example03 {
    public static void main(String[] args) {
        System.out.println("<----------Welcome to calculator--------->");
        System.out.println("Enter 1 for Adding\n" + "Enter 2 for Subtracting\n" + "Enter 3 for Multiplying\n" + "Enter 4 for divide");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int num1, num2;
        double result;
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to add:");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                Add add = new Add();
                result = add.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.println("Enter two numbers to subtract:");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                Subtract subtract = new Subtract();
                result = subtract.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.println("Enter two numbers to multiply:");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                Multiply multiply = new Multiply();
                result = multiply.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
                case 4:
                    System.out.println("Enter two numbers to divide:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    Divide divide = new Divide();
                    result = divide.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
