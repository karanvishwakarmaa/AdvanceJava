package CoreJava.Rxamples;

class Calc {
    public int add(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}

public class Demo {
    public static void main(String[] args) {
//        int num1 = 4;
//        int num2 = 5;
        Calc calc1 = new Calc();
        int result = calc1.add(18 , 12);
        System.out.println(" The Ans. of Your Question is: "+ result);
    }
}
