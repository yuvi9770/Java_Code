package P_C_103_105.practice_Executor;

public class TaskPrint implements Runnable{

    private char target;

    public TaskPrint(char target) {
        this.target = target;
    }

    @Override
    public void run() {
      
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n %s End of %c task \n",Thread.currentThread().getName(),target);
    }   
}
