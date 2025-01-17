package P_C_40_50_Array;

import java.util.Scanner;

public class delete_from_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Array Deletion \n");
        int[] num = ArrayUtility.inputArray();
        System.out.print("Enter the number to be deleted : ");
        int a = input.nextInt();
        int[] nArr = Delete_num(num, a);
        System.out.println("Here is your new Array:");
        ArrayUtility.displayArray(nArr);

        input.close();
    }

    public static int[] Delete_num(int[] num, int a) {
        int occ = count_element.count(num, a);
        if (occ == 0) {
            return num;
        }
        int newSize = num.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < num.length) {
            if (num[i] != a) {
                newArr[j] = num[i];
                j++;
            }
            i++;
        }

        return newArr;

    }
}
