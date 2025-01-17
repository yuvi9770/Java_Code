package P_C_40_50_Array;

import java.util.Scanner;

public class searching_2D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D array searching:");
        int[][] arr = ArrayUtility.input2DArray();
        System.out.print("Enter the number to be searched:");
        int num = input.nextInt();
        boolean isfound = search(arr, num);
        if (isfound) {
            System.out.println("Yes the number is present");
        } else {
            System.out.println("No it is not present");
        }
        input.close();
    }

    public static boolean search(int[][] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
