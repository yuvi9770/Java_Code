package P_C_28_39;

import java.util.Scanner;

public class sum_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = input.nextInt();
        int sum = sumodd(num);
        System.out.println(sum);

        input.close();
    }

    public static int sumodd(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum;
    }
}
