import java.util.Scanner;

public class far_to_cel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp in fareh: ");
        float far = input.nextFloat();

        float cel = (far - 32) * 5 / 9;
        System.out.println("Temp in celcius: " + cel);

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }

}
