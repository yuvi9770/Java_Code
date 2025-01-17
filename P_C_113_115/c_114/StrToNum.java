package P_C_113_115.c_114;

import java.util.List;

public class StrToNum {
    public static void main(String[] args) {
        List<String> number = List.of("1","2","3","4","5");

        number.stream()
        .map(Integer :: parseInt) /* Str -> Integer.parseInt(Str) */
        .map(num -> Math.pow(num, 2))
        .reduce((a,b) -> a + b)
        .ifPresent(System.out :: println);
    }
}
