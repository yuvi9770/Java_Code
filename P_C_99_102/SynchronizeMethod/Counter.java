package P_C_99_102.SynchronizeMethod;

public class Counter {
    
    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }

}