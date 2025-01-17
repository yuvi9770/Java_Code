package P_C_40_50_Array;

public class Palindrom_array {
    public static void main(String[] args) {
        System.out.println("Check array is palindrome or not:");
        int[] num = ArrayUtility.inputArray();
        // ispalindrome(num);
        if (ispalindrome(num)) {
            System.out.println("Yes, it is palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
    }

    public static boolean ispalindrome(int[] num) {
        int i = 0;
        while (i < num.length / 2) {
            if (num[i] != num[(num.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
