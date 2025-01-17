import java.util.Scanner;

public class age_grp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age categories");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("you are a senior citizen");
        } else if (age >= 20) {
            System.out.println("you are adult");
        } else if (age >= 13) {
            System.out.println("You are a teen");
        } else {
            System.out.println("You are a child");
        }
        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
