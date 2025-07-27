package demo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private int counter = 0;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    public void increment() {

        reentrantLock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        //Runnable task = () -> {
        //    for (int i = 0; i < 100; i++) {
        //        example.increment();
        //    }
        //};
        Runnable task=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    example.increment();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + example.counter);
    }
}