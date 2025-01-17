package P_C_99_102.SynchronizeMethod;

public class TestingSync {
    public static void main(String[] args) {
        Counter counter = new Counter();

        UpdaterThead t1 = new UpdaterThead(counter);
        UpdaterThead t2 = new UpdaterThead(counter);

        

       try {
        t1.start();
        t2.start();

        t1.join();
        t2.join();
       } catch (InterruptedException e) {
        System.out.printf("Intrrupted : %s", e.getMessage());
       }

       System.out.printf("Final counter value: %d", counter.getCount());

    } 
}
