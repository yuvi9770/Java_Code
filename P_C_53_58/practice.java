package P_C_53_58;

public class practice {
    public static void main(String[] args) {
        int a = 22;
        int b = 4;
        int c = 11;

        int great = a > b ? a : b;
        System.out.println(great);

        int great1 = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(great1);
    }
}
