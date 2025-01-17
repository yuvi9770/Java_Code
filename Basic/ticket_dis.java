import java.util.Scanner;

public class ticket_dis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to ticket discount");
        System.out.print("enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you female?: (true/false) ");
        boolean isfemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("75% discount");
        } else if (isfemale) {
            System.out.println("50% discpunt");
        } else if (age > 60 && !isfemale) {
            System.out.println("25% discount");
        } else {
            System.out.println("no discount");
        }

        input.close();//to close resources like Scanner to release system resources and avoid potential memory leaks
    }
}
