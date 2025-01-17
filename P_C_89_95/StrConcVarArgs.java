package P_C_89_95;

public class StrConcVarArgs {
    public static void main(String[] args) {
        System.out.println(Conc("hello"));
        System.out.println(Conc("hello","World"));
        System.out.println(Conc("hello","Programmers","Welcome"));
        System.out.println(Conc("hello","it's","good","day"));
        
    }

    public static String Conc(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }

        return sb.toString();
    }
}
