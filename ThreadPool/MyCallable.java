package ThreadPool;

import java.util.concurrent.*;

public class MyCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable<String> callable = new Callable<>() {
        //    /**
        //     * Computes a result, or throws an exception if unable to do so.
        //     *
        //     * @return computed result
        //     * @throws Exception if unable to compute a result
        //     */
        //    @Override
        //    public String call() throws Exception {
        //        return "123";
        //    }
        //};
        //
        //ExecutorService executor = Executors.newFixedThreadPool(2);
        //Future<String> submit = executor.submit(callable);
        //FutureTask<String> stringFutureTask = new FutureTask<>(callable);
        //executor.submit(stringFutureTask);
        //System.out.println(stringFutureTask.get());
        //System.out.println(submit.get());
        //executor.shutdown();

        FutureTask futureTask = new FutureTask<String>(new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        },"456");
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
