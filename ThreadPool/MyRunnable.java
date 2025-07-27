package ThreadPool;
public class MyRunnable extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // 启动线程
    }
}