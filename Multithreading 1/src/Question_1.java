class RunnableThread implements Runnable {
    @Override
    public void run() {
        try {
            //thread 1 will sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted");
        }
        System.out.println("Thread running using Runnable Interface");
    }
}

public class Question_1 extends Thread {
    @Override
    public void run() {
        try {
            //Thread 2 will sleep for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread running using Thread Class");
    }

    public static void main(String[] args) {
        RunnableThread runnable = new RunnableThread();
        Thread thread1 = new Thread(runnable, "Thread 1");
        Question_1 thread2 = new Question_1();

        try {
            System.out.println("Thread 1 will start executing !!");
            thread1.start();
            thread1.join();
            System.out.println("Thread 1 terminated\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("Thread 2 will start executing !!");
            thread2.start();
            thread2.join();
            System.out.println("Thread 2 terminated\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread ended !! ");
    }
}
