package P_C_89_95.collection_practice;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceface {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("Programming");
        strList.add("world");
        strList.add(1, "welcome to");
        strList.remove(0);

        if (strList.contains("world")) {
            System.out.println(strList.indexOf("world"));
            
        }

        for (int i = 0; i < strList.size(); i++) {
            
            System.out.printf("%s ",strList.get(i));
        }
    }
}
