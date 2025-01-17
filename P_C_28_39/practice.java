package P_C_28_39;

public class practice {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 4;
            while (j > i) {
                System.out.print("  ");
                j--;
            }

            int k = 0;
            while (k <= i) {
                System.out.print("* ");
                k++;

            }
            System.out.println("");
            i++;

        }
    }

}
