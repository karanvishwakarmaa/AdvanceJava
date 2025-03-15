package CoreJava.CoreJava01.Loops.while_loop;

public class Ex21 {
    public static void main(String[] args) {
        int i =1;

        while (i <= 4) {

            System.out.println("Hii" + i);
            int j =1;
            while (j <= 3) {
                System.out.print("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}
