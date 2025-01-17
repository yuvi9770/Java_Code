import java.util.Scanner;

public class odd_even_bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("odd and even using Bitwise operator:");

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        if ((first & 1) == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }

        input.close();// to close resources like Scanner to release system resources and avoid
                      // potential memory leaks

    }

}
