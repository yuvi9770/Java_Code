package P_C_40_50_Array;

public class check_array_sorted {
    public static void main(String[] args) {
        int[] num = ArrayUtility.inputArray();
        if (isdec(num) || isinc(num)) {
            System.out.println("Yes its sorted");
        } else {
            System.out.println("No,it is not sorted");
        }
    }

    public static boolean isinc(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] < num[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isdec(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] > num[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
