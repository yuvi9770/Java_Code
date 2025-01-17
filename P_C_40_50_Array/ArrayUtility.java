package P_C_40_50_Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");

        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("enter the no.  " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        // input.close();
        return arr;

    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of column:");
        int column = input.nextInt();

        int[][] Arr = new int[rows][column];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("enter the row " + (i + 1) + " column " + (j + 1) + ": ");
                Arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        // input.close();
        return Arr;

    }

    public static void display2DArray(int[][] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {

                System.out.print(arr[i][j]);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void displayArray(int[] num) {
        int i = 0;
        while (i < num.length) {
            System.out.print(num[i] + " ");
            i++;
        }
        System.out.println("");
    }

}
