package CoreJava.CoreJava01.TypeConversation_Casting;

public class Ex05 {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        byte b = 100;
        short s = (short) b; // implicit casting
        int i = s; // implicit casting
        long l = i; // implicit casting
        float f = l; // implicit casting
        double d = f; // implicit casting

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
    }
}
