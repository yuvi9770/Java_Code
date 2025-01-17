package P_C_40_50_Array;

import java.util.Scanner;

public class array_searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = { 21, 6, 3, 1, 57, 34, 2, 214, 4, 45, 45, 4, 54 };
        System.out.println("Welcome to array searching:");
        System.out.print("Enter a number:");
        int num = input.nextInt();

        boolean found = isfound(arr, num);

        if (found) {
            System.out.println("yes, it is founded");
        } else {
            System.out.println("no, it is not founded");
        }
        input.close();
    }

    public static boolean isfound(int[] arr, int num) {

        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}