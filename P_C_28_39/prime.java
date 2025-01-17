package P_C_28_39;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (isPrim(num)) {
            System.out.println("Yes it is prime");
        } else {
            System.out.println("No it is not prime");
        }

        input.close();
    }

    public static boolean isPrim(int num) {
        if (num < 2) {
            return false; // 0 and 1 are not prime
        }
        int i = 2;
        int sqrtNum = (int) Math.sqrt(num); // this will reduce number of iteration if it is a prime
        while (i < sqrtNum) {
            System.out.println(i);
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}