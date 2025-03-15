package CoreJava.CoreJava01.VariablesAndDataTypes;

public class Ex02 {
//    Certainly! I'll explain the data types in Java and provide examples of how to use them. In Java, there are two main categories of data types: primitive data types and reference data types.
//Let's add a method to your Ex01 class to demonstrate various data types:
//Complete
//package BasicJava;
//
//public class Ex01 {
//    public Ex01() {
//    }
//
//    public static void main(String[] args) {
//        // ... existing code ...
//
//        demonstrateDataTypes();
//    }
//
//    public static void demonstrateDataTypes() {
//        // Primitive Data Types
//        byte byteVar = 127;                  // 8-bit signed two's complement integer
//        short shortVar = 32767;              // 16-bit signed two's complement integer
//        int intVar = 2147483647;             // 32-bit signed two's complement integer
//        long longVar = 9223372036854775807L; // 64-bit signed two's complement integer
//        float floatVar = 3.14f;              // 32-bit IEEE 754 floating point
//        double doubleVar = 3.14159265359;    // 64-bit IEEE 754 floating point
//        boolean booleanVar = true;           // true or false
//        char charVar = 'A';                  // 16-bit Unicode character
//
//        // Reference Data Types
//        String stringVar = "Hello, Java!";   // String class
//        int[] arrayVar = {1, 2, 3, 4, 5};    // Array
//
//        // Printing values
//        System.out.println("byte: " + byteVar);
//        System.out.println("short: " + shortVar);
//        System.out.println("int: " + intVar);
//        System.out.println("long: " + longVar);
//        System.out.println("float: " + floatVar);
//        System.out.println("double: " + doubleVar);
//        System.out.println("boolean: " + booleanVar);
//        System.out.println("char: " + charVar);
//        System.out.println("String: " + stringVar);
//        System.out.println("Array: " + java.util.Arrays.toString(arrayVar));
//    }
//}
//Apply
//Explanation of Java data types:
//1.
//Primitive Data Types:
//byte: 8-bit signed two's complement integer. Range: -128 to 127.
//short: 16-bit signed two's complement integer. Range: -32,768 to 32,767.
//int: 32-bit signed two's complement integer. Range: -2^31 to 2^31-1.
//long: 64-bit signed two's complement integer. Range: -2^63 to 2^63-1.
//float: 32-bit IEEE 754 floating point. Use 'f' suffix for float literals.
//double: 64-bit IEEE 754 floating point. Default for decimal values.
//boolean: Represents true or false.
//char: 16-bit Unicode character. Range: '\u0000' (0) to '\uffff' (65,535).
//2.
//Reference Data Types:
//String: Sequence of characters (not a primitive type, but commonly used).
//Arrays: Fixed-size container for elements of the same type.
//Classes: User-defined types that serve as templates for objects.
//Interfaces: Abstract types that specify a set of methods.
//Key points:
//Primitive types are stored directly in memory and are generally more efficient.
//Reference types store addresses (references) to objects in memory.
//The String class is special in Java and is often treated like a primitive type.
//Arrays in Java are objects, even if they contain primitive types.



        public Ex02() {
        }

        public static void main(String[] args) {
            // ... existing code ...

            demonstrateDataTypes();
        }

        public static void demonstrateDataTypes() {
            // Primitive Data Types
            byte byteVar = 127;                  // 8-bit signed two's complement integer
            short shortVar = 32767;              // 16-bit signed two's complement integer
            int intVar = 2147483647;             // 32-bit signed two's complement integer
            long longVar = 9223372036854775807L; // 64-bit signed two's complement integer
            float floatVar = 3.14f;              // 32-bit IEEE 754 floating point
            double doubleVar = 3.14159265359;    // 64-bit IEEE 754 floating point
            boolean booleanVar = true;           // true or false
            char charVar = 'A';                  // 16-bit Unicode character

            // Reference Data Types
            String stringVar = "Hello, Java!";   // String class
            int[] arrayVar = {1, 2, 3, 4, 5};    // Array

            // Printing values
            System.out.println("byte: " + byteVar);
            System.out.println("short: " + shortVar);
            System.out.println("int: " + intVar);
            System.out.println("long: " + longVar);
            System.out.println("float: " + floatVar);
            System.out.println("double: " + doubleVar);
            System.out.println("boolean: " + booleanVar);
            System.out.println("char: " + charVar);
            System.out.println("String: " + stringVar);
            System.out.println("Array: " + java.util.Arrays.toString(arrayVar));
        }
    }

