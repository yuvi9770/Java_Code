package P_C_99_102;

import P_C_99_102.MultiThreading_Runnable.PrintTask;

public class TestingPriority {
    public static void main(String[] args) {
        
        PrintTask p1 = new PrintTask('@');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('!');

        Thread t1 =new Thread(p1);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        // new Thread(p1).start(); //Cannot invoke start() on the primitive type void

        Thread t2 =new Thread(p2);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        Thread t3 =new Thread(p3);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.start();

    }
}
