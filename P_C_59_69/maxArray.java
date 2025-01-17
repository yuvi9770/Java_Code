package P_C_59_69;

import P_C_40_50_Array.ArrayUtility;

public class maxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max integer finder in Areay");

        int[] arr = ArrayUtility.inputArray();
        int Max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (Max < num) {
                Max = num;
            }
        }
        System.out.println("Maximum number is: " + Max);
    }
}
