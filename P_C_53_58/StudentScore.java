package P_C_53_58;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Score checker:");
        System.out.print("Enter the marks of student: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : marks > 50 ? "Moderate" : "Low";
        System.out.println("Score of Student is: " + category);

        input.close();
    }
}
