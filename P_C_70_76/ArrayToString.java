package P_C_70_76;

public class ArrayToString {
    public static void main(String[] args) {
        String[] str = { "Hello", "Welcome", "to", "the", "world", "of", "programming", "where", "the", "technology",
                "continously", "evolve" };

        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(string).append(" ");

        }
        System.out.println(sb);

    }
}
