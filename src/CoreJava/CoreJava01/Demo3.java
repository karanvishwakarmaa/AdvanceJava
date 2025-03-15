package CoreJava.CoreJava01;

class calc1 {
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int calc2(int n1, int n2){
        return n1 + n2;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        calc1 obj = new calc1();
        int r1 = obj.add(3,4,3);
        System.out.println(r1);
    }
}
