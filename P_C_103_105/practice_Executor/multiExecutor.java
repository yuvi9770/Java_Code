package P_C_103_105.practice_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiExecutor {
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i <10; i++) {
            TaskPrint task = new TaskPrint((char) ('A'+i));
            service.submit(task);
        }        
        service.shutdown();

        System.out.println("\n ------Before-----");
        
        //Use to stop the program after a fix time
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n ------After-------");
            service.shutdownNow();
        }
    }
}
