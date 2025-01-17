package P_C_28_39;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (ispali(num)) {
            System.out.println("Yes it is palindrome");
        } else {
            System.out.println("No it is not palindrome");
        }
        input.close();
    }

    public static boolean ispali(int num) {
        return num == rev(num);
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
