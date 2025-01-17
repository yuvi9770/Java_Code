package P_C_89_95;

import java.util.Arrays;
import java.util.List;

public class Listswap {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(num);
        swap(num,1 , 6);
        System.out.println(num);

    }

    public static void swap(List<Integer> num, int x, int y){
        int swap = num.get(x);
        num.set(x, num.get(y));
        num.set(y, swap);
    }
}