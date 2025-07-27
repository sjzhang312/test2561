package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);// 创建线程池


        for(int i=0;i<10;i++){
            executor.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }


        //executor.submit(()->{
        //    System.out.println("Threda is running:"+Thread.currentThread().getName());
        //});
        executor.shutdown();
    }
}
