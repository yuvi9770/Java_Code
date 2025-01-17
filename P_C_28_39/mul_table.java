package P_C_28_39;

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        multiplication(num);
        input.close();// to close resources like Scanner to release system resources and avoid
                      // potential memory leaks
    }

    public static void multiplication(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
