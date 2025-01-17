package P_C_28_39;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int rev = rev(num);
        System.out.print("Reverse:" + rev);

        input.close();
    }

    public static int rev(int num) {
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum = sum * 10 + n;
            num /= 10;

        }
        return sum;
    }

}
