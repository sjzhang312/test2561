package Singleton;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MultiConditionDemo {

    private final ReentrantLock lock = new ReentrantLock();



    private final Condition conditionA = lock.newCondition();
    private final Condition conditionB = lock.newCondition();


    public void awaitA() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " 等待在 conditionA...");
            conditionA.await();  // 阻塞在条件A
            System.out.println(Thread.currentThread().getName() + " 被 conditionA 唤醒！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " 等待在 conditionB...");
            conditionB.await();  // 阻塞在条件B
            System.out.println(Thread.currentThread().getName() + " 被 conditionB 唤醒！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA() {
        lock.lock();
        try {
            System.out.println("主线程 signalA() 调用");
            conditionA.signal();
        } finally {
            lock.unlock();
        }
    }

    public void signalB() {
        lock.lock();
        try {
            System.out.println("主线程 signalB() 调用");
            conditionB.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiConditionDemo demo = new MultiConditionDemo();

        // 启动线程A：等待在 conditionA
        Thread threadA = new Thread(demo::awaitA, "Thread-A");
        threadA.start();

        // 启动线程B：等待在 conditionB
        Thread threadB = new Thread(demo::awaitB, "Thread-B");
        threadB.start();

        // 主线程休眠1秒，确保两个线程都进入等待状态
        Thread.sleep(1000);

        // 只唤醒 conditionA 上等待的线程
        demo.signalA();

        // 再等1秒，唤醒另一个
        Thread.sleep(1000);
        demo.signalB();
    }
}
