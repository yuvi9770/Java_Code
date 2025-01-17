
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year calculator");
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("this is leap year");

        } else {
            System.out.println("Not a leap year");
        }

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
