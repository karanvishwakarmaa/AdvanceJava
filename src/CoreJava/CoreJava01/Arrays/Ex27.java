package CoreJava.CoreJava01.Arrays;



public class Ex27 {
    public static void main(String[] args) {
        int nums [][] = new int [3][4];
        int random = 0;

//        (int)Math.random() * 100

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "");
            }
            System.out.println();
        }
    }
}
