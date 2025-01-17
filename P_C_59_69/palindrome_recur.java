package P_C_59_69;

import java.util.Scanner;

public class palindrome_recur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome using recursion");
        System.out.print("Enter the string: ");
        String str = input.next();
        System.out.println("Your String is " + (ispalindo(str) ? "Palindrome" : "NOt a Palindrome"));
        input.close();
    }

    public static boolean ispalindo(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)) {
            return false;
        }
        String newstr = str.substring(1, lastpos);
        return ispalindo(newstr);
    }
}
