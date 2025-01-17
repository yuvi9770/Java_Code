package P_C_96_98.practice;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        
        Map<String, Integer> map= new HashMap<>();
        map.put("Rama",95 );
        map.put("Luv",75 );
        map.put("Ravi",22 );
        map.put("Vijay",44 ); 
        map.put("Akash",65 ); 

        System.out.println(map.toString());
        System.out.println(map.size());
        System.out.println(map.get("Rama"));
        System.out.println(map.containsKey("Luv"));
        System.out.println(map.remove("Ravi"));

       for (String key : map.keySet()) {
        System.out.printf("%s: %d ", key,map.get(key));
       }
    }
}
