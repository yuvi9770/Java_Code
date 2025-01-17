package P_C_99_102.multiThreading_Threads;

public class FirstClass extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d%c ",i,veh);
        }
        System.out.printf("\n %s End of first task ",Thread.currentThread().getName());
    }


    private char veh;
    
    public FirstClass(char veh) {
        this.veh = veh;
    }
    
}
