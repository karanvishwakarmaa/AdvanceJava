package CoreJava.Object;

import java.util.Scanner;

class Calc{
     public int add(int a , int b){
         System.out.println(a + b);
         return 0;
     }
}


public class Example00 {
    public static void main(String[] args) {
//        int num1=4,num2=5;
//        int res = num1+num2;
//        System.out.println(res);Calc
        Scanner scanner = new Scanner(System.in);

        Calc c = new Calc();
        c.add(22,12);
        System.out.println(c);
    }
}
