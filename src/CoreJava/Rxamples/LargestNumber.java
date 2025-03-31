package CoreJava.Rxamples;

import java.util.Scanner;

public class LargestNumber {
        public static void main(String[] args) {
            int[] numbers = {10, 25, 78, 99, 45, 63};
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("The largest number in the array is: " + max);
        }
    }

