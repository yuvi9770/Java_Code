import java.util.Scanner;

public class compound_interest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount ");
        float pri = input.nextFloat();
        System.out.print("Enter Rate ");
        float Rate = input.nextFloat();
        System.out.print("Enter Time ");
        float Time = input.nextFloat();

        double SI = pri * Math.pow((1 + Rate / 100), Time);
        System.out.println("Compound interest " + SI);

        input.close();// to close resources like Scanner to release system resources and avoid
                      // potential memory leaks
    }
}