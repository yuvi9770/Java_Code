package P_C_59_69;

import java.util.Scanner;

public class Fibonacci_recur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci using recursion");
        System.out.print("Enter the number of element:");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
        input.close();
    }

    public static int fibo(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibo(i - 1) + fibo(i - 2);
    }
}
