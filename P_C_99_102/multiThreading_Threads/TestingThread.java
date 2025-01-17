package P_C_99_102.multiThreading_Threads;

public class TestingThread {
    public static void main(String[] args) { 
        long StartTime = System.currentTimeMillis();

        System.out.println("First Starts ");
        FirstClass t1 = new FirstClass('@');
        t1.start();

        System.out.println("Second Starts ");
        FirstClass t2 = new FirstClass('#');
        t2.start();

        // System.out.println("Fourth Starts ");
        // SecondClass t4 = new SecondClass();
        // t4.start();
        // System.out.println("Third Starts ");
        // ThirdClass t3 = new ThirdClass();
        // t3.start();


        long EndTime = System.currentTimeMillis();
        System.out.printf(" %s Time taken : %d ",Thread.currentThread().getName(),EndTime-StartTime);
    }
}