import java.util.Random;
import java.util.concurrent.*;

public class Question_4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(()-> new Random().nextInt(100));
        try {
            System.out.println("Random Integer is " + future.get() );
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}