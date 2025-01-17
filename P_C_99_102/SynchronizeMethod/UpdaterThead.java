package P_C_99_102.SynchronizeMethod;

public class UpdaterThead extends Thread {

    private Counter counter;

    public UpdaterThead(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
