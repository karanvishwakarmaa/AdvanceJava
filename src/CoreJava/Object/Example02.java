package CoreJava.Object;

import java.util.Scanner;

class Calcula{
  public int add(int a , int b){
      return a + b;
  }
}

public class Example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second numbers: ");
        int num2 = scanner.nextInt();
        Calcula calculator = new Calcula();
        int sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
