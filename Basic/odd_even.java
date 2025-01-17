import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even checker");
        System.out.print("Enter the number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");

        } else {
            System.out.println("odd number");
        }
        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
