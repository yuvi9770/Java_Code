package P_C_99_102.c_100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();

        System.out.printf("Start of thread: %s \n",t1.getState());

        t1.start();
        t1.join();
        System.out.printf("End of thread: %s \n",t1.getState());

    }
}
