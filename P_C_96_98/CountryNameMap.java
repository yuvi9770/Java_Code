package P_C_96_98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryNameMap {
    public static void main(String[] args) {
        
        Map<String, String> contryMap = new HashMap<>();
        contryMap.put("India", "Delhi");
        contryMap.put("China", "Beijing");
        contryMap.put("SriLanka", "Columbo");
        contryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country: ");
        String country = input.next();
        if (contryMap.containsKey(country)) {
            System.out.printf("Capital of %s : %s", country,
            contryMap.get(country));
        }else{
            System.out.println("Sorry we dont't find");
        }

        input.close();
    }
}
