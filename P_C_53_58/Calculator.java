package P_C_53_58;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the second number:");
        int b = input.nextInt();
        System.out.print("Enter the operation: ");
        char c = input.next().charAt(0);

        int result = operate(a, b, c);
        System.out.println("Final output is " + (result == -1 ? "Operator invalid" : result));
        input.close();
    }

    public static int operate(int a, int b, char c) {
        int output = switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> -1;
        };
        return output;
    }
}