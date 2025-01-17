package P_C_89_95;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FreqElement {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,5,3,3,2,2,2,23,7,3,1,5,3,2);
        System.out.println(Collections.frequency(num, 1));
        System.out.println(Collections.frequency(num, 2));
        System.out.println(Collections.frequency(num, 7));
        System.out.println(Collections.frequency(num, 11));
    }
}
