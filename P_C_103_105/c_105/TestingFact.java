package P_C_103_105.c_105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFact {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newFixedThreadPool(2);
        
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            Factorial task = new Factorial(i);
            list.add(service.submit(task));
        }

        for (Future<Integer> future : list) {
            System.out.printf("\n factorial of is: %d", future.get());
        }
        service.shutdown();

        if (!service.awaitTermination(10,TimeUnit.SECONDS)) {
            System.out.println("\n EMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }    
}