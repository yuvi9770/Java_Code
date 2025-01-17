import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount ");
        float pri = input.nextFloat();
        System.out.print("Enter Rate ");
        float Rate = input.nextFloat();
        System.out.print("Enter Time ");
        float Time = input.nextFloat();

        double SI = pri * Rate * Time / 100;
        System.out.println("Simple interest " + SI);

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
