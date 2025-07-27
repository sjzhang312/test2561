package Lock;

public class ReentrantDemo {
    public synchronized void methodA(ReentrantDemo other) {
        System.out.println(Thread.currentThread().getName() + ": Method A");
        try {
            Thread.sleep(100); // 模拟延迟，增加死锁机会
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        other.methodB(); // 尝试获取另一个对象的锁
    }

    public synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + ": Method B");
    }
}

class Demo1 {
    public static void main(String[] args) {
        ReentrantDemo demo1 = new ReentrantDemo();
        ReentrantDemo demo2 = new ReentrantDemo();

        // 线程 1：调用 demo1.methodA(demo2)
        Thread thread1 = new Thread(() -> demo1.methodA(demo2), "Thread-1");

        // 线程 2：调用 demo2.methodA(demo1)
        Thread thread2 = new Thread(() -> demo2.methodA(demo1), "Thread-2");

        thread1.start();
        thread2.start();
    }
}