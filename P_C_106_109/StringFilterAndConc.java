package P_C_106_109;

import java.util.List;

public class StringFilterAndConc {
    public static void main(String[] args) {
        List<String> names = List.of("HelloWorld!","Welcome","Welcome To programming","Best","Biggestnumber","Love");

        String result = names.stream()
                .filter(name -> name.length()>10)
                .reduce("",(a,b)->a+" "+b);
        System.out.println(result);
    }
}
