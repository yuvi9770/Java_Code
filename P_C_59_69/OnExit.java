package P_C_59_69;

import java.util.Scanner;

public class OnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your word: ");
            String words = input.next();
            if (words.equals("exit")) {
                break;
            }
        }
        System.out.println("successful Exits");
        input.close();
    }

}
