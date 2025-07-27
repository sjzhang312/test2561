package ThreadPool;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        return "Thread is running"+Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(new MyCallable());
        System.out.println(future.get());
        executor.shutdown();

        //LinkedList
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());
    }


}
