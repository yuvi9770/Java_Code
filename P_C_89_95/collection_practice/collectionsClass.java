package P_C_89_95.collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsClass {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        Collections.addAll(num, 21,5,6,-55);
        Utility.print(num);

        Collections.sort(num);
        Utility.print(num);

        Collections.reverse(num);
        Utility.print(num);

        System.out.println(Collections.binarySearch(num,5,Collections.reverseOrder())); //need a ascending order list
       
    }
}