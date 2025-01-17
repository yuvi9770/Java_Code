import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of triangle ");
        float base = input.nextFloat();
        System.out.print("Enter the hypothesis of triangle ");
        float Hypo = input.nextFloat();

        double Area = (1.0 / 2.0) * base * Hypo;
        System.out.println("Area of triangle " + Area);

        input.close();// to close resources like Scanner to release system resources and avoid
                      // potential memory leaks
    }
}
