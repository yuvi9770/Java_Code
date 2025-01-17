package P_C_40_50_Array;

public class avg {
    public static void main(String[] args) {
        int[] num = ArrayUtility.inputArray();

        System.out.println(sum(num));
        System.out.println(average(num));
    }

    public static double average(int[] num1) {
        double sum = sum(num1);
        return sum / num1.length;
    }

    public static int sum(int[] num1) {
        int sum = 0;
        int i = 0;
        while (i < num1.length) {
            sum += num1[i];
            i++;
        }
        return sum;
    }

}
