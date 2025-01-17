package P_C_28_39;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        fibo(num);
        input.close();
    }

    public static void fibo(int num) {
        int a = 0, b = 1;

        if (num < 0)
            return;
        System.out.print(a + " ");
        if (num == 0)
            return;
        System.out.print(b + " ");

        while (a + b < num) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }

    }
}
