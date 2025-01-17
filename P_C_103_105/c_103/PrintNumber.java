package P_C_103_105.c_103;

public class PrintNumber implements Runnable{


    @Override
    public void run() {
        
        for (int i = 0; i <10; i++) {
            System.out.printf("Number is: %d \n",(i+1));
        }
    }
    
}
