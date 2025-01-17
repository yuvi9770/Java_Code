package P_C_106_109;

import java.util.List;
//import java.util.function.Consumer;

public class FilterPractice {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "cherry", "dates");
        System.out.println(fruits.size());

        // Behind the seen of lambda function
        // fruits.stream().forEach(new Consumer<String>(){
        //     @Override
        //     public void accept(String t) {
        //         System.out.println(t);
        //     }
        // });
        System.out.println("Printing fruits using streams:");
        fruits.stream().forEach(fruit -> System.out.println(fruit));

        System.out.println("Applying filters:");
        fruits.stream().filter(fruit -> fruit.endsWith("e")).forEach(fruit -> System.out.println(fruit));

    }
}
