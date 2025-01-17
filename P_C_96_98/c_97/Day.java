package P_C_96_98.c_97;

public enum Day {
    Monday(true), 
    Tuesday(true), 
    Wednesday(true), 
    Thursday(true), 
    Friday(true), 
    Saturday(false), 
    Sunday(false);

    private boolean isWeekday;

    private Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public  String getType(){
        return isWeekday ? "weekday" : "weekend" ;
    }
}
