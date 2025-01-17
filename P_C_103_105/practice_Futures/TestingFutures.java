package P_C_103_105.practice_Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException  {
        
        ExecutorService service = Executors.newFixedThreadPool(2);
       
        FetchingName t1 = new FetchingName("Rama");
        FetchingName t2 = new FetchingName("Shayam");
        FetchingName t3 = new FetchingName("Aman");
        FetchingName t4 = new FetchingName("Jay");

        Future<String> name1 = service.submit(t1);
        Future<String> name2 = service.submit(t2);
        Future<String> name3 = service.submit(t3);
        Future<String> name4 = service.submit(t4);

        System.out.printf("\n Your name: "+name4.get());
        System.out.printf("\n Your name: "+name1.get());
        System.out.printf("\n Your name: "+name2.get());
        System.out.printf("\n Your name: "+name3.get());
        

        service.shutdown();
    }
    
}
