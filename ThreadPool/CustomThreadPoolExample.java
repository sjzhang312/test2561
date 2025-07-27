package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExample {
    public static void main(String[] args) {
        //创建自定义线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
          2,
          5,
          60L,
          TimeUnit.SECONDS,
          new LinkedBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        //提交任务
        for(int i=0;i<15;i++){
            final int taskId =i;
            executor.submit(()->{
                System.out.println("Taks"+ taskId+" is running on"+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }
}
