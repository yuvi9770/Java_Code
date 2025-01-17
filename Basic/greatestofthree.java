import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to comparision between three number:");
        System.out.print("enter first number:");
        int a = input.nextInt();
        System.out.print("enter second number:");
        int b = input.nextInt();
        System.out.print("enter third number:");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " First is greatest");
        } else if (b >= c) {
            System.out.println(b + " Second is greatest");
        } else {
            System.out.println(c + " third is greatest");
        }
        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
