package P_C_99_102.multiThreading_Threads;

public class SecondClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d* ",i);
        }
       
        System.out.printf("\n %s End of second task ",Thread.currentThread().getName());
    }
}
