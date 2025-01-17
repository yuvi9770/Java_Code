package P_C_59_69;

import P_C_40_50_Array.ArrayUtility;

public class SumPositive {
    public static void main(String[] args) {
        System.out.println("Positive number sum in Array");

        int[] num = ArrayUtility.inputArray();

        int sum = 0;
        for (int i : num) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum of positive number is " + sum);
    }
}
