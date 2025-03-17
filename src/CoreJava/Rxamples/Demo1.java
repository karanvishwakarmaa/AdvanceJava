package CoreJava.Rxamples;

class Calculator {
    public static int add(int a, int b) { //methods...
        return a + b;
    }
}
public class Demo1 {
    public static void main(String[] args) {
     int a = 55, b = 45;
     int sum = Calculator.add(a,b);
     System.out.println("Sum: " + sum);
    }
}
