package P_C_113_115;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationpractice {
    public static void main(String[] args) {
        List<Integer> number = List.of(5,6,8,2,6);
        Optional<Integer> maxNum = number.stream()
        .max(Integer :: compareTo);
        maxNum.ifPresent(System.out :: println);
        

        Optional<Integer> minNum = number.stream()
        .min(Integer :: compareTo);
        minNum.ifPresent(System.out :: println);


        List<String> words = Arrays.asList("Hello","Welcome","to","java");
        List<String> CollectWords = words.stream().collect(Collectors.toList());
        System.out.println(CollectWords);
    }
}
