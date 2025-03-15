package CoreJava.Switch_Statements;

public class Ex17 {
    public static void main(String[] args) {
        int num = 9;

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Six to Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
