package P_C_53_58;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute value checker:");
        System.out.print("Enter the number: ");
        int a = input.nextInt();

        int result = a > 0 ? a : (-a);
        System.out.println("Absolute number of " + a + " is " + result);
        input.close();
    }
}
