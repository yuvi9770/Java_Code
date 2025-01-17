package P_C_89_95;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomComp {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Lion","Zebra","Ant","Bear","Dog","Cat");
        System.out.println(str);
        sortDescending(str);
        System.out.println(str);
    }

    public static void sortDescending(List<String> str){
        Collections.sort(str, new Comparator<String>() {
          
            @Override
            public int compare(String s, String T){
                if (s.equals(T)) {
                    return 0;
                }else if (s.charAt(0)<T.charAt(0)) {
                    return 1;
                }else{
                    return -1;
                }
            }  
        });

    }
}