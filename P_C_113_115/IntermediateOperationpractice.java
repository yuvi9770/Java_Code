package P_C_113_115;

import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationpractice {
    public static void main(String[] args) {
        List<Integer> number = List.of(5,1,64,32,65,22,55,6);
        List<Integer> sortNum = number.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(sortNum);

        List<String> items = List.of("apple","banana","grapes","apple","dates","banana");
        List<String> distItem = items.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println(distItem);


        List<String> words = List.of("hello","World","to","programmers");
        List<String> upperWord = words.stream()
        .map(String :: toUpperCase)
        .collect(Collectors.toList());
        System.out.println(upperWord);
    }
}
