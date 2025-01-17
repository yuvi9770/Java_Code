package P_C_59_69;

import java.util.Scanner;

import P_C_40_50_Array.ArrayUtility;

public class Occ_No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to occurance checker");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the element to be search: ");
        int num = input.nextInt();

        int occur = occurance(arr, num);
        System.out.println("Element occured " + occur + " times");
        input.close();

    }

    public static int occurance(int[] arr, int num) {
        int occ = 0;
        for (int i : arr) {
            if (i == num) {
                occ++;
            }
        }
        return occ;
    }
}
