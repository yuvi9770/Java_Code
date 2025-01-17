package P_C_106_109;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReducePractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        // Behind the scene of reduce method
        int num =numbers.stream().reduce(0,new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) { 
                return t+u;
            }
        });
        System.out.println(num);

        System.out.println("using Reduce method:");
        int num2 = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(num2);

        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
        System.out.println(max);
    }
}
