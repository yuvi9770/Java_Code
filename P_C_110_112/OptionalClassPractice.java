package P_C_110_112;

import java.util.List;
import java.util.Optional;

public class OptionalClassPractice {
    public static void main(String[] args) {
        List<Integer> number = List.of(0,1,2,3,4,5,6,7,8,9,10);

        int num = number.stream()
        .reduce(0, (a,b) -> a+b);
        System.out.println(num);

        Optional<Integer> num2 = number.stream()
        .reduce((a,b) -> a+b);
        System.out.println(num2);

        if (num2.isPresent()) {
            System.out.println(num2.get());
        } else {
            System.out.println("List is empty");
        }



        Optional<String> optEmpty = Optional.empty();
        Optional<String> optOf = Optional.of("Hello");
        Optional<String> optNullable = Optional.ofNullable(null);
       
        System.out.println(optNullable);
        
        if (optOf.isPresent()) {
            System.out.printf("Value is present: %s \n", optOf.get());
        }

        String orElseEx = optEmpty.orElse("Default");
        System.out.printf("Using orElse: %s",orElseEx);
        
        
    }
}