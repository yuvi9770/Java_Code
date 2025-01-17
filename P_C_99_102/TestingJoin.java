package P_C_99_102;

import P_C_99_102.MultiThreading_Runnable.PrintTask;

public class TestingJoin {
     public static void main(String[] args) throws InterruptedException {
        
        PrintTask p1 = new PrintTask('@');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('!');

        Thread t1 =new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 Starts");

        Thread t2 =new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 Starts");
        t1.join();
        
        Thread t3 =new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 Starts");

    }
}
