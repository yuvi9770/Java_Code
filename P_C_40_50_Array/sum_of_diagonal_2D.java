package P_C_40_50_Array;

public class sum_of_diagonal_2D {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2D Diagonal sum:");
        int[][] num = ArrayUtility.input2DArray();
        long sum = sumofdiagonal(num);
        System.out.println("Sum of diagonal is:" + sum);

    }

    public static long sumofdiagonal(int[][] num) {
        long left = sumofleft(num);
        long right = sumofright(num);
        long sum = left + right;
        if (num.length % 2 != 0) {
            int ind = num.length / 2;
            sum -= num[ind][ind];
        }
        return sum;
    }

    public static long sumofleft(int[][] num) {
        long sum = 0;
        int i = 0;
        while (i < num.length) {
            sum += num[i][i];
            i++;
        }
        return sum;
    }

    public static long sumofright(int[][] num) {
        long sum = 0;
        int i = 0;
        while (i < num.length) {
            int col = num.length - 1 - i;
            sum += num[i][col];
            i++;
        }
        return sum;
    }
}
