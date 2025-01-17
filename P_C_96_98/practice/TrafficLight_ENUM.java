package P_C_96_98.practice;

public enum TrafficLight_ENUM {
    RED("Stop"), GREEN("GO"), YELLOW("Start");

    private String action;

    private TrafficLight_ENUM(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    } 
    
}