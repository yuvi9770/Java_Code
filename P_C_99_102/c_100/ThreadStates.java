package P_C_99_102.c_100;

public class ThreadStates extends Thread {
    
    @Override
    public void run() {


        try {
            Thread.sleep(5000);
            System.out.printf("Inside Run: %s \n",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
