package P_C_59_69;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime"));
        input.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int sqrtnum = (int) Math.sqrt(num);
        for (int i = 2; i < sqrtnum; i++) {
            if (num % i == 0) {
                return false;
            }
            System.out.println(i);
        }
        return true;
    }
}