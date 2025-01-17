import java.util.Scanner;

public class add_float {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number ");
        float a = input.nextFloat();
        System.out.print("Enter Second number ");
        float b = input.nextFloat();

        float c = a * b;
        System.out.println("Result " + c);
        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
