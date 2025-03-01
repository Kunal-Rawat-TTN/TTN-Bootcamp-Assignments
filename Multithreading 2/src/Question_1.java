import java.util.concurrent.*;
// unlike runnable callable also returns a result
class CallableThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        // we use throws here but can't in Runnable
        Thread.sleep(2000);
        return "Callable Thread Running !!";
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Thread Running");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        // you can't pass callable to a thread
        // so you have to use ExecutorService to execute

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callableThread);
        try {
            //waiting for the value until then flow of control doesn't change
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        RunnableThread runnableThread = new RunnableThread();

        //executing another runnable thread using executor
        executorService.execute(runnableThread);
        executorService.shutdown();

    }
}