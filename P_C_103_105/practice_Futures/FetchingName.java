package P_C_103_105.practice_Futures;

import java.util.concurrent.Callable;

public class FetchingName implements Callable<String>{


    private String name;

    
    public FetchingName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting name of %s", name);
        Thread.sleep(4000);
        return name + " Great to see you";
    }
    
}
