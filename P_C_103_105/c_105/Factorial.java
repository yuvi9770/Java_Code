package P_C_103_105.c_105;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>{
    
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        
        Thread.sleep(3000);
        if (number <= 1) {
            return 1;
        }

        int result= 1;
        for (int i = 2; i <= number; i++) {
           result *= i; 
        }
        return result;
    }
} 