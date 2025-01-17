package P_C_103_105.c_104;

public class SleepTask implements Runnable {
    
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Start thread: %s \n",current.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.printf("End thread: %s \n",current.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
