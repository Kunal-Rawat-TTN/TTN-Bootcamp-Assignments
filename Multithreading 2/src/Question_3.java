import java.util.concurrent.*;

public class Question_3 {
    private static void executeAndPrint(ExecutorService executor) {
        for (int id = 0; id < 5; id++) {
            int taskId = id + 1;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " running Task " + taskId);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        // Using SingleThreadExecutor
        System.out.println("Single Thread Executor");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        executeAndPrint(singleThreadExecutor);

        // Using CachedThreadPool
        System.out.println("\nCachedThreadPool");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        executeAndPrint(cachedThreadPool);

        // Using FixedThreadPool(3)
        System.out.println("\nFixedThreadPool(3)");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        executeAndPrint(fixedThreadPool);
    }
}

