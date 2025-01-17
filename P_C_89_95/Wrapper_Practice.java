package P_C_89_95;

public class Wrapper_Practice {

    public static void main(String[] args) {
        // this method Can take integer or sring  but can not pass double
        Integer first = Integer.valueOf("4567");
        System.out.println(first);

        // Autoboxing of int to Integer as object
        Integer second = 33;
        System.out.println(second);

        // can assign nul values to variable
        Integer secd = null;
        System.out.println(secd);

        // unboxing to normal int
        int c= second;
        System.out.println(c);

    }
}
