package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable {


    public static void main(String[] args) {
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                System.out.println(111);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.execute(runnable);
        executor.shutdown();
    }
}
