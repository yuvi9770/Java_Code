package P_C_89_95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uniquechar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String user = input.nextLine();
        input.close();

      for (char ch : user.toCharArray()) {
        unique.add(ch);
      }
      System.out.printf("unique character in your string: %d",unique.size());
    } 
}