package ThreadPool;
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 创建线程池：2个核心线程，4个最大线程，有界队列容量10
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            5, // 核心线程数
            10, // 最大线程数
            60L, TimeUnit.SECONDS, // 空闲线程存活时间
            new ArrayBlockingQueue<>(100), // 有界队列
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy() // 拒绝策略
        );

        // 提交20个任务
        for (int i = 1; i <= 107; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 模拟任务执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // 关闭线程池
        executor.shutdown();

    }
}