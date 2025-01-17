package P_C_89_95.collection_practice;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        
        Set <String> name = new HashSet<>();
        System.out.println(name.add("Hello"));
        System.out.println(name.add("world"));
        System.out.println(name.add("welcome"));
        Utility.print(name);

        System.out.println(name.add("Hello"));
        System.out.println(name.size());

        System.out.println(name.contains("hello"));
        System.out.println(name.remove("Hello"));
        Utility.print(name);
    }
}
