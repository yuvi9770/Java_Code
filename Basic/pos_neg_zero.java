import java.util.Scanner;

public class pos_neg_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        float number = input.nextFloat();

        if (number > 0) {
            System.out.println("Positive number");

        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("It is Zero");
        }

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
