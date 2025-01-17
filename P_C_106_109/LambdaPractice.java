package P_C_106_109;

public class LambdaPractice {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Runnable runnable = () -> System.out.println("Hello world");
        runnable.run();
        
    }
}
