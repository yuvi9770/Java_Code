package P_C_99_102.c_101;

public class PrintThread extends Thread {
    
    private int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread starting %d \n",Thread.currentThread().getName(), threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ending %d \n",Thread.currentThread().getName(), threadNumber);
        
    }
}
