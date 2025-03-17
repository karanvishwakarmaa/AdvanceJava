package CoreJava.Rxamples;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Welcome to the Calculator***********");
        System.out.println("<<<---Please Enter the following numbers for your requirements--->>> ");
        System.out.println("Enter 1 for Adding the numbers");
        System.out.println("Enter 2 for Subtracting the numbers");
        System.out.println("Enter 3 for Multiplying the numbers");
        System.out.println("Enter 4 for Divide the numbers");
        System.out.println("Enter 5 for Modules the numbers");
        System.out.println("Enter 6 for Marks in 'Percentages'");

        int choice = sc.nextInt();
        double num1, num2, num3, num4, num5, num6;

        switch (choice) {
            case 1:
                System.out.println(" Please enter what's number should be added...");
                System.out.println("Enter 1 for adding two numbers");
                System.out.println("Enter 2 for adding three numbers");
                System.out.println("Enter 3 for adding four numbers");
                int chh = sc.nextInt();
                switch (chh) {
                    case 1:
                        System.out.println("Enter two numbers to add: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Enter three numbers to add: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        System.out.println("Result: " + (num1 + num2 + num3));
                        break;

                    case 3:
                        System.out.println("Enter Four number to add: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        System.out.println("Result: " + (num1 + num2 + num3 + num4));
                }


            case 2:
                System.out.println(" Please enter what's number should be Substract...");
                System.out.println("Enter 1 for sub two numbers");
                System.out.println("Enter 2 for sub three numbers");
                System.out.println("Enter 3 for sub four numbers");
                int chhh = sc.nextInt();
                switch (chhh) {
                    case 1:
                        System.out.println("Enter two numbers to sub: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + (num1 - num2));
                        break;

                    case 2:
                        System.out.println("Enter three numbers to sub: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        System.out.println("Result: " + (num1 - num2 - num3));
                        break;

                    case 3:
                        System.out.println("Enter Four number to sub: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        System.out.println("Result: " + (num1 - num2 - num3 - num4));
                }

            case 3:
                System.out.println(" Please enter what's number should be Multmultipling...");
                System.out.println("Enter 1 for multipling two numbers");
                System.out.println("Enter 2 for multipling three numbers");
                System.out.println("Enter 3 for multipling four numbers");
                int chhhh = sc.nextInt();
                switch (chhhh) {
                    case 1:
                        System.out.println("Enter two numbers to multipling: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + (num1 * num2));
                        break;

                    case 2:
                        System.out.println("Enter three numbers to multipling: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        System.out.println("Result: " + (num1 * num2 * num3));
                        break;

                    case 3:
                        System.out.println("Enter Four number to multipling: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        System.out.println("Result: " + (num1 * num2 * num3 * num4));
                }

            case 4:
                System.out.println(" Please enter what's number should be divide...");
                System.out.println("Enter 1 for divide two numbers");
                System.out.println("Enter 2 for divide three numbers");
                System.out.println("Enter 3 for divide four numbers");
                int chhhhh = sc.nextInt();
                switch (chhhhh) {
                    case 1:
                        System.out.println("Enter two numbers to divide: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        System.out.println("Result: " + (num1 / num2));
                        break;

                    case 2:
                        System.out.println("Enter three numbers to divide: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        System.out.println("Result: " + (num1 / num2 / num3));
                        break;

                    case 3:
                        System.out.println("Enter Four number to divide: ");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        System.out.println("Result: " + (num1 / num2 / num3 / num4));
                }

            case 5:
                System.out.println(" Please enter what's number should be modules...");
                System.out.println("Enter two numbers to modules: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("Result: " + (num1 % num2));
                break;

            case 6:
                System.out.println(" Welcome, firstly your enter which standard you are in..?");
                System.out.println("Enter 1 for 10th class Students");
                System.out.println("Enter 2 for 11th class students");
                int chhhhhhhhh = sc.nextInt();
                switch (chhhhhhhhh) {
                    case 1:
                        System.out.println("Welcome 10th Class Students: ");
                        System.out.println("Enter one by one your all 6 subjects marks in series -->Hindi/English/Math/Science/Social/Sanskrit<--");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        num5 = sc.nextDouble();
                        num6 = sc.nextDouble();
                        System.out.println("Your 10th Class Result is: " + ((num1 + num2 + num3 + num4 + num5 + num6) / 6));
                        break;

                    case 2:
                        System.out.println("Welcome 12th Class Students: ");
                        System.out.println("Enter one by one your all 5 subjects marks in series");
                        num1 = sc.nextDouble();
                        num2 = sc.nextDouble();
                        num3 = sc.nextDouble();
                        num4 = sc.nextDouble();
                        num5 = sc.nextDouble();
                        System.out.println("Your 10th Class Result is: " + ((num1 + num2 + num3 + num4 + num5) / 5));
                        break;


                }
        }
    }
}
