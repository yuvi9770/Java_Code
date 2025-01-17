package P_C_53_58;

import java.util.Scanner;

public class MinNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to min no using ternary");
        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the second number:");
        int b = input.nextInt();
        MinNo operator = new MinNo();
        int min = operator.mini(a, b);
        System.out.println("minimun number " + min);
        input.close();

    }

    public int mini(int num1, int num2) {

        return num1 > num2 ? num2 : num1;
    }
}
