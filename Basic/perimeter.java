import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side ");
        float a = input.nextFloat();
        System.out.print("Enter the second side ");
        float b = input.nextFloat();
        System.out.print("Enter the third side ");
        float c = input.nextFloat();
        System.out.print("Enter the fourth side ");
        float d = input.nextFloat();

        System.out.println("Perimeter " + (a + b + c + d));

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
