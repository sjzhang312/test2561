import java.util.concurrent.*;

public class CustomThreadPoolExample {
    public static void main(String[] args) {
        //创建自定义线程池
        ThreadPoolExecutor executor= new ThreadPoolExecutor(
          2,   //核心线程数
          4,//最大线程数
                60L, //空闲县城存活时间
                TimeUnit.SECONDS, //时间单位
                new LinkedBlockingQueue<>(10), //任务队列
                Executors.defaultThreadFactory(),  //线程工厂
                new ThreadPoolExecutor.AbortPolicy() //拒绝策略
        );

        //ExecutorService executor1=Executors.newFixedThreadPool(2);

        //提交5个任务
        for(int i=1; i<=15;i++){
            final int taskID =i;
            executor.submit(()->{
                System.out.println("Task"+taskID +" is running on thread"+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            });
        }
        //关闭线程池
        executor.shutdown();
    }
}
