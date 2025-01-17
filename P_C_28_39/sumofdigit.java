package P_C_28_39;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(sum(num));

        input.close();

    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum += n;
            num /= 10;

        }
        return sum;
    }
}
