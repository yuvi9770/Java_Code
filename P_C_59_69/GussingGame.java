package P_C_59_69;

import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Gussing Game");
        int num = 5, guess;
        do {
            System.out.print("enter the number between(0-10): ");
            guess = input.nextInt();

        } while (num != guess);
        System.out.println("Successfully guess the number");
        input.close();
    }
}
