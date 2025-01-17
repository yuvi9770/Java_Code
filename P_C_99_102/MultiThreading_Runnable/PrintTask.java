package P_C_99_102.MultiThreading_Runnable;

public class PrintTask implements Runnable {
   
    @Override
    public void run() {
      
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n %s End of %c task ",Thread.currentThread().getName(),target);
    }

    
    private char target;

    public PrintTask(char target) {
        this.target = target;
    } 
}
