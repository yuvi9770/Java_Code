package P_C_40_50_Array;

public class practice {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 6 } };

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {

                System.out.print(arr[i][j]);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
