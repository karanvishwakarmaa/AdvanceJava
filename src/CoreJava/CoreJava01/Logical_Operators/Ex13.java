package CoreJava.CoreJava01.Logical_Operators;

public class Ex13 {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x>y && a < b;
        boolean result1 = x>y || a>b;
        System.out.println(result);
        System.out.println(result1);
    }
}
