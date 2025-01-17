package P_C_99_102.c_101;

public class MainPro {
    public static void main(String[] args) throws InterruptedException {
        PrintThread p1 = new PrintThread(1);
        PrintThread p2 = new PrintThread(2);
        PrintThread p3 = new PrintThread(3);

        p1.start();
        p1.join();
        
        p2.start();
        p2.join();

        p3.start();
        

    }
}
