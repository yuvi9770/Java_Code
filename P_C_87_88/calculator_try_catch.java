package P_C_87_88;
import java.util.Scanner;

public class calculator_try_catch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division calculator\n");
        System.out.print("Enter first no: ");
        int first = input.nextInt();
        System.out.print("Enter second no: ");
        int second = input.nextInt();
        input.close();
        try{
                int result = first/ second;
                System.out.printf("Result is %d", result);
        }catch(ArithmeticException exception){

            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Can not divide by zero");
            } else{
                throw exception;
            }
        }
        
    }
}
