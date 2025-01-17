package P_C_106_109;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        int result = multi.apply(5, 9);
        System.out.println(result);
    }
}
