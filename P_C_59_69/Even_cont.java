package P_C_59_69;

public class Even_cont {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

    }
}
