package P_C_103_105.c_103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleServiceExecutor {
    public static void main(String[] args) {
        
    try (ExecutorService service = Executors.newSingleThreadExecutor()) {
        PrintNumber task = new PrintNumber();
        service.submit(task);
        
    } 
   
    }
}
