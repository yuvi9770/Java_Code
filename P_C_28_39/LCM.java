package P_C_28_39;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.println(lcm(first, second));
        input.close();
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int fac = first * i;
            if (fac % second == 0) {
                return fac;
            }
            i++;
        }
    }
}