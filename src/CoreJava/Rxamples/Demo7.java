package CoreJava.Rxamples;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number for which table is required
        System.out.print("Enter a number for the table: ");
        int number = sc.nextInt();

        // Display the multiplication table using for loop
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
