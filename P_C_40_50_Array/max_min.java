package P_C_40_50_Array;

public class max_min {
    public static void main(String[] args) {
        int[] num = ArrayUtility.inputArray();
        max(num);
        min(num);
    }

    public static void max(int[] num) {
        int a = num[0];
        int i = 1;
        while (i < num.length) {
            if (a < num[i]) {
                a = num[i];
            }
            i++;
        }
        System.out.println("Maximum number " + a);
    }

    public static void min(int[] num) {
        int a = num[0];
        int i = 1;
        while (i < num.length) {
            if (a > num[i]) {
                a = num[i];
            }
            i++;
        }
        System.out.println("Minimun number " + a);
    }
}
