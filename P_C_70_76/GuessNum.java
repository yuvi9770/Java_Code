package P_C_70_76;

import java.util.Scanner;

public class GuessNum {
    int random;

    GuessNum() {
        this.random = (int) Math.round(Math.random() * 100);
    }

    int differ(int guess) {
        return guess - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNum game = new GuessNum();

        System.out.println("Welcome to Guess game:");
        int guess;
        int result;
        do {
            System.out.print("Enter the number between 1-100: ");
            guess = input.nextInt();
            result = game.differ(guess);
            if (result == 0) {
                System.out.println("Congrats, it is correct");
            } else if (result > 0) {
                System.out.println("Guess a lower number");
            } else {
                System.out.println("Guess a greater number");
            }
        } while (guess != result);

        input.close();
    }
}