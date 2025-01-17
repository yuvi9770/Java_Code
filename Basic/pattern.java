public class pattern {
    public static void main(String[] args) {

        int row = 5;
        while (row >= 0) {
            // System.out.print("*");

            int i = row;
            while (i > 0) {
                System.out.print("* ");
                i--;
            }
            System.out.println();
            row--;
        }
    }
}
