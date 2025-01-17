import java.util.Scanner;

public class grade_cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade calculator");
        System.out.print("Enter your percentage: ");
        float mark = input.nextFloat();

        if (mark >= 90) {
            System.out.println("You got A grade");
        } else if (mark >= 75) {
            System.out.println("You got B grade");
        } else if (mark >= 60) {
            System.out.println("You got C grade");
        } else if (mark >= 30) {
            System.out.println("You got D grade");
        } else {
            System.out.println("You are fail");
        }
        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
