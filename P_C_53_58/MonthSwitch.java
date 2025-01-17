package P_C_53_58;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month Mapping:");
        System.out.print("Enter the month number: ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("Your month is " + monthName);
        input.close();
    }

    public static String getMonthName(int monthNum) {
        String output = switch (monthNum) {
            case 1 -> "january";
            case 2 -> "Feb";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Aug";
            case 9 -> "sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "wrong input";
        };
        return output;
    }
}