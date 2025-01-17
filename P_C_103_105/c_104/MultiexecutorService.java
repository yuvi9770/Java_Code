package P_C_103_105.c_104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiexecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            SleepTask task = new SleepTask();
            service.submit(task);
        }
        service.shutdown();


        try {
            if (!service.awaitTermination(10,TimeUnit.SECONDS)) {
                System.out.println("\n EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
