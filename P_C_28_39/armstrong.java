package P_C_28_39;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number:");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isArm(num)) {
            System.out.println("Yes it is Armstrong");
        } else {
            System.out.println("No it is not Armstrong");
        }

        input.close();
    }

    public static boolean isArm(int num) {
        int numcopy = num;
        int digit = ndigit(num);
        int finaln = 0;
        while (num > 0) {
            int last = num % 10;
            num = num / 10;
            finaln = finaln + pov(last, digit);
        }
        // System.out.println(finaln);
        return finaln == numcopy;
    }

    public static int pov(int num, int digit) {
        int i = 0;
        int result = 1;
        while (i < digit) {
            result *= num;
            i++;
        }
        // System.out.println(result);
        return result;
    }

    public static int ndigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        // System.out.println(digit);
        return digit;
    }
}
