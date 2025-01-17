package P_C_89_95;

import java.util.Arrays;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        System.out.println(num);
        reverse(num);
        System.out.println(num);
    }

    public static void reverse(List<Integer> num){
      //  Collections.reverse(num);

      for (int i = 0; i < num.size()/2; i++) {
        Listswap.swap(num, i, num.size()-1-i);
      }
   
    }
}