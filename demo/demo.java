package demo;


import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class demo {
    private  static AtomicInteger cnt= new AtomicInteger(0);

    public static void increase(){
        int newValue= cnt.incrementAndGet();
        System.out.println(newValue);;
    }
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService =Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++){

            executorService.execute(()-> increase());
        }
        Thread.sleep(1500);
        System.out.println("cnt="+cnt);

        executorService.shutdown();
    }
}
class Thread2{
    public static void main(String[] args) {
        //创建自定义线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                5,
                60L,
                TimeUnit.SECONDS,
                //new LinkedBlockingQueue<>(10),
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );


        for(int i=0;i<20;i++){
            int finalI = i;
            executor.execute( ()->{

                System.out.println( Thread.currentThread().getName()+"-"+ finalI);
            });
        }
        executor.shutdown();



    }
}

class Demo0719{

    public static void main(String[] args) throws InterruptedException {
        //BlockingQueue<Integer> queue =new ArrayBlockingQueue(2);
        //
        //new Thread(() -> {
        //    try {
        //        Thread.sleep(2000); // 模拟延迟
        //        int taken = queue.take(); // 取出 1，队列有空位
        //        System.out.println("取出: " + taken);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}).start();
        //
        //queue.put(1);
        //System.out.println(queue);
        //queue.put(2);
        //queue.put(3);
        ////int take = queue.take();
        //System.out.println(queue);
        ThreadPoolExecutor executor =new ThreadPoolExecutor(
                2,5,10,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

       //Runnable runnable =new Runnable() {
       //    @Override
       //    public void run() {
       //        System.out.println(111);
       //    }
       //};
       //executor.execute(runnable);
       Callable<Integer> callable =new Callable() {
           @Override
           public Integer call() throws Exception {

               //System.out.println(2);
               return 1;
           }
       };
       for(int i=0;i<10;i++){
           Future<Integer> submit = executor.submit(callable);
           try {
               System.out.println(submit.get());
           } catch (ExecutionException e) {
               throw new RuntimeException(e);
           }
       }
       executor.shutdown();


    //    try {
    //        System.out.println(submit.get());
    //    } catch (ExecutionException e) {
    //        throw new RuntimeException(e);
    //    }
    //    executor.shutdown();
    //
    //    MyCallable myCallable =new MyCallable();
    //    FutureTask<Integer> future = new FutureTask<Integer>(callable);
    //    Thread t=new Thread(future);
    //    t.start();
    //
    //    try {
    //        Integer integer = future.get();
    //        System.out.println(integer);
    //    } catch (ExecutionException e) {
    //        throw new RuntimeException(e);
    //    }
    }
}

//class MyCallable implements Callable<Integer>{
//    @Override
//    public Integer call() throws Exception {
//
//        System.out.println(2);
//        return 111222222;
//    }
//}

