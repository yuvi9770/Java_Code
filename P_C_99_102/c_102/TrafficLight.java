package P_C_99_102.c_102;

public class TrafficLight extends Thread{

    private TrafficColor color;

    public TrafficLight(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active \n",color);
        try {
            Thread.sleep(color.getTimeInMills());
        } catch (Exception e) {
           throw new RuntimeException(e);
        }

        System.out.printf("%s Inactive \n", color);
    }
    
}
