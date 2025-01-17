package P_C_110_112;

import java.util.stream.IntStream;

public class FactoraialNum {
    public static void main(String[] args) {
        int number = 51;

        System.out.println("Factorial usng normal method:");
        System.out.println(factorial(number));


        System.out.println("Factorial using Functional programming:");
        IntStream.rangeClosed(2, number)
        .reduce((a,b) -> a * b)
        .ifPresentOrElse(System.out::println, () -> System.out.println("1"));
    }

    public static long factorial(int num){

    if (num == 0 || num == 1) {
        return 1;
    }

    long fact =1;
    for (int i = 2; i <= num; i++) {
        fact *= i;
    }
        return fact;
    }
}
