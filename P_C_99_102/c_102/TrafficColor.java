package P_C_99_102.c_102;

public enum TrafficColor {
    
    RED(6000), 
    YELLOW(1000),
    GREEN(4000);

    private int timeInMills;

    private TrafficColor(int timeInMills) {
        this.timeInMills = timeInMills;
    }

    public int getTimeInMills() {
        return timeInMills;
    }
       
}
