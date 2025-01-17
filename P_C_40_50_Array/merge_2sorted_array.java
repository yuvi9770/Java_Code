package P_C_40_50_Array;

public class merge_2sorted_array {
    public static void main(String[] args) {
        System.out.println("Welcome to merging of array:");
        int[] num1 = ArrayUtility.inputArray();
        int[] num2 = ArrayUtility.inputArray();

        int[] merr = merge(num1, num2);
        System.out.println("Sorted Array:");
        ArrayUtility.displayArray(merr);

    }

    public static int[] merge(int[] num1, int[] num2) {
        int newSize = num1.length + num2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;

        while (i < num1.length || j < num2.length) {
            if (j == num2.length ||
                    (i < num1.length && num1[i] < num2[j])) {
                newArr[k] = num1[i];
                i++;
                k++;
            } else {
                newArr[k] = num2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
