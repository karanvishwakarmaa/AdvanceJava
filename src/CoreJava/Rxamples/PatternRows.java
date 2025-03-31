package CoreJava.Rxamples;

import java.util.Scanner;

public class PatternRows {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows : ");
            int rows = sc.nextInt();

            int num = 1;
            for(int i = 1; i<= rows; i++){
                for(int j = 1; j<= i; j++){
                    if(num == 15){
                        break;
                    }
                    System.out.print(num + " ");
                    num++;
                }
                if(num == 15){
                    break;
                }
                System.out.println();

            }
            sc.close();
        }
    }

