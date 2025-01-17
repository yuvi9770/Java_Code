package P_C_40_50_Array;

public class reverse_array {
    public static void main(String[] args) {
        System.out.println("Array Reversing: ");
        int[] num = ArrayUtility.inputArray();
        reverse(num);
        System.out.println("Reversed array:");
        ArrayUtility.displayArray(num);
    }

    public static void reverse(int[] num) {
        int i = 0;
        while (i < num.length / 2) {
            int swap = num[i];
            num[i] = num[(num.length - 1) - i];
            num[(num.length - 1) - i] = swap;
            i++;
        }

    }
}
