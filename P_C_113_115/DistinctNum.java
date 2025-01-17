package P_C_113_115;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctNum {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,5,2,5,2,1,3,6,21,2);

        List<Integer> num = number.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println(number);
        System.out.println(num);
    }
}
