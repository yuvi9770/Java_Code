package P_C_89_95;

public class VarArgs_practice {
    public static void main(String args[]) {
        System.out.println(sum(1,3,4));
        System.out.println(sum(1,5,6,4,3,3,3,3));
        System.out.println(sum(new int[]{1,2,4,5}));
        
    }

    public static int sum(int... a){
        int sum=0;
      for (int i : a) {
        sum += i;
      }
      return sum;
    }
}
