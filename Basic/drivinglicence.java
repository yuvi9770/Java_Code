import java.util.Scanner;

public class drivinglicence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to drivinglicence checker");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible");

        } else {
            System.out.println("not eligible");
        }

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
