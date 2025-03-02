package CoreJava.literals;

public class Ex03 {

    public static void main(String[] args) {


        /*
         * Literals in Java
         *
         * Java me literals woh fixed values hote hain jo directly code me assign kiye ja sakte hain.
         * Ye values program execution ke dauraan change nahi hoti hain.
         */

        // Integer Literals
        int decimalNumber = 25;  // Decimal (Base 10)
        int binaryNumber = 0b1101;  // Binary (Base 2)
        int octalNumber = 031;  // Octal (Base 8)
        int hexNumber = 0x1A;  // Hexadecimal (Base 16)

        // Floating-Point Literals
        float pi = 3.14f;  // Float type (suffix 'f' lagana zaroori hai)
        double price = 99.99;  // Default double type
        double scientificNotation = 2.5e3;  // 2.5 * 10^3

        // Character Literals
        char letter = 'A';
        char digit = '5';
        char specialChar = '@';
        char newLine = '\n';  // Escape sequence for new line

        // String Literals
        String greeting = "Hello, Java!";
        String numberString = "12345";

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isRainy = false;

        // Null Literal
        String myStr = null;

        /*
         * Conclusion:
         * Literals fixed values hote hain jo Java code me directly assign kiye ja sakte hain.
         * Yeh integer, floating-point, character, string, boolean, aur null type ke ho sakte hain.
         */

    }
}
