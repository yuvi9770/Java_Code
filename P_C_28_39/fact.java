package P_C_28_39;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        long fa = fac(num);
        System.out.println(fa);

        input.close();
    }

    public static long fac(int num) {
        if (num < 2) {
            return 1;
        } else {
            long sum = 1;

            while (num > 0) {
                sum *= num;
                num--;
            }
            return sum;
        }
    }
}
