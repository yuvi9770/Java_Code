package P_C_40_50_Array;

import java.util.Scanner;

public class count_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = ArrayUtility.inputArray();
        System.out.print("Enter the element to be search: ");

        int ar = input.nextInt();
        System.out.println(ar);
        int no = count(num, ar);
        input.close();
        System.out.println("Count of " + ar + " in the array: " + no);

    }

    public static int count(int[] num1, int ar) {
        int i = 0;
        int count = 0;
        while (i < num1.length) {
            if (num1[i] == ar) {
                count++;
            }
            i++;
        }
        return count;
    }
}
