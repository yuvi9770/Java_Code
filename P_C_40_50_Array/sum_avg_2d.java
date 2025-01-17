package P_C_40_50_Array;

public class sum_avg_2d {
    public static void main(String[] args) {
        System.out.println("Calculate the sum and avg of 2D array:");
        int[][] num = ArrayUtility.input2DArray();
        System.out.println("Sum of array is: " + sum(num));
        System.out.println("Sum of array is: " + avg(num));

    }

    public static double avg(int[][] num) {
        if (num.length == 0) {
            return 0;
        }
        int row = num.length;
        int colm = num[0].length;
        double size = row * colm;
        return sum(num) / size;
    }

    public static int sum(int[][] num) {
        int sum = 0;
        int i = 0;
        while (i < num.length) {
            int j = 0;
            while (j < num[i].length) {
                sum += num[i][j];
                j++;
            }

            i++;
        }
        return sum;
    }
}
