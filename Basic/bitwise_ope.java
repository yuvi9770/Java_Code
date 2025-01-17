import java.util.Scanner;

public class bitwise_ope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise operator:");

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        System.out.println("AND result " + (first & second));
        // System.out.println("OR result " + (first | second));
        // System.out.println("XOR result " + (first ^ second));
        // System.out.println("NOT result " + (~first));
        // System.out.println("LEFT shift result " + (first << 5));
        System.out.println("RIGHT shift result " + (first >> 1));

        input.close();// to close resources like Scanner to release system resources and avoid
                      // potential memory leaks
    }
}
