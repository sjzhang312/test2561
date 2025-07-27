import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTask implements Callable<String> {


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        return "code";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask task = new CallableTask();
        FutureTask<String> stringFutureTask = new FutureTask<>(task);
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        System.out.println(stringFutureTask.get());
    }
}   
