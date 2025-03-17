package CoreJava.Rxamples;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        double area = Math.pow(sideLength, 2);
        System.out.printf("The area of the square is %.2f square units%n", area);
        scanner.close();
    }
}
