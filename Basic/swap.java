import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swap program ");
        System.out.print("Enter first number ");
        int a = input.nextInt();
        System.out.print("Enter Second number ");
        int b = input.nextInt();

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("value of first no " + a);
        System.out.println("value of second no " + b);

    }
}