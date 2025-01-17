package P_C_99_102.c_102;

public class testingLight {
    public static void main(String[] args) throws InterruptedException {
        
        TrafficLight red = new TrafficLight(TrafficColor.RED);
        TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);
        TrafficLight green = new TrafficLight(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
    }
}
