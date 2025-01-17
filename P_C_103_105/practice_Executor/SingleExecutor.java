package P_C_103_105.practice_Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        TaskPrint t1 = new TaskPrint('$');
        TaskPrint t2 = new TaskPrint('*');
        TaskPrint t3 = new TaskPrint('#');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);

        service.shutdown();        
    }
}
