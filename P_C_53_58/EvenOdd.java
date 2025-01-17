package P_C_53_58;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Oddeven using ternary");
        System.out.print("Enter the first number:");
        int a = input.nextInt();

        String res = a % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your no is " + res);
        input.close();
    }
}