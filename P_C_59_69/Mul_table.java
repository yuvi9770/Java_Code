package P_C_59_69;

import java.util.Scanner;

public class Mul_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO TABLE MULTIPLICATION");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
        input.close();
    }
}
