import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question_5 {
    public static void main(String[] args) {
        ExecutorService  executorService = Executors.newFixedThreadPool(2);
        for(int i=0;i<5 ;i++){
            final int taskID = i;
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+" executing Task "  + taskID );
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" completed Task "  + taskID );
            });
        }
        executorService.shutdown();

        System.out.println("Shutdown Called !\n");
        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All Tasks Completed !!!!\n");

        //for shutdownNow
        ExecutorService  executorForShutNow = Executors.newFixedThreadPool(2);
        for(int i=0;i<5 ;i++){
            final int taskID = i;
            executorForShutNow.submit(()->{
                System.out.println(Thread.currentThread().getName()+" executing Task "  + taskID );
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" completed Task "  + taskID );
            });
        }

        executorForShutNow.shutdownNow();
        System.out.println("\nShutdownNow Called !");
        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}