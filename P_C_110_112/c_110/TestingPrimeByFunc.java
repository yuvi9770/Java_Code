package P_C_110_112.c_110;

public class TestingPrimeByFunc {

    public static void main(String[] args) {
       
        PrimeNum number = num -> {
           
            if (num > 2) {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            return false;
        };

        System.out.println(number.isprime(4));
    }
}