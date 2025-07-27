package OnlineCode;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(123);
    }

    public static void main(String[] args) {
        MyThread thread =new MyThread();
        thread.start();
    }
}

class MyRunnable implements Runnable{

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(111);
    }


    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable());
        t.start();
    }
}


class MyCallable implements Callable<Integer>{

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        return 1;
    }

    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask =new FutureTask<>(myCallable);
        Thread t1=new Thread(futureTask);

    }
}