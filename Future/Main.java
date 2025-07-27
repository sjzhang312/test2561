package Future;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        // 异步执行任务
        CompletableFuture.supplyAsync(() -> {
            System.out.println("异步任务运行在: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "任务结果";
        }).thenAccept(result -> {
            // 处理结果
            System.out.println("异步任务完成，结果: " + result);
        });

        System.out.println("主线程继续执行: " + Thread.currentThread().getName());
    }
}