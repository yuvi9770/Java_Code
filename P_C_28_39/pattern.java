package P_C_28_39;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Welcome to pattern programming");
        firstpattern();
        System.out.println();
        secondpattern();
        thirdpattern();

    }

    public static void firstpattern() {
        int i = 1;
        while (i <= 5) {
            int j = i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println("");
            i++;
        }
    }

    public static void secondpattern() {
        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println("");
            i--;
        }
    }

    public static void thirdpattern() {
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