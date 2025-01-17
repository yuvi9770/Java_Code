package P_C_53_58;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of number is: " + fact);
        input.close();

    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
