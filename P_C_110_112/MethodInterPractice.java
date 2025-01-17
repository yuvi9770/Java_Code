package P_C_110_112;

import java.util.List;

public class MethodInterPractice {
    public static void main(String[] args) {
        
        List<Integer> number = List.of(0,1,2,3,4,5,6,7,8,9,10);

        number.stream().filter(num -> num % 2 != 0)
        .forEach(num -> System.out.println(num));

        System.out.println("Using method reference:");
        number.stream().filter(num -> num % 2 != 0)
        .forEach(System.out::println);

        int num2 = number.stream().reduce(0, (a,b) -> a+b);
        System.out.println(num2);

        num2 = number.stream().reduce(0, Integer :: sum);
        System.out.println(num2);

    }
} 

