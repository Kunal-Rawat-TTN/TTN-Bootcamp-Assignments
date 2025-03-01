import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Resource {
    int capacity;
    String resourceName;
    Lock lock;

    Resource(int capacity, String resourceName, Lock lock) {
        this.capacity = capacity;
        this.resourceName = resourceName;
        this.lock = lock;
    }

    public static void getCapacity(Resource resource1, Resource resource2) {
        while (true)
        {
            //will try to get lock if it gets the lock then try to get other lock
            //it couldn't have both locks then releases the acquired lock and wait for 500 milliseconds
            //it will waste some cycles of acquiring locks but will prevent deadlock
            boolean gotFirstLock = resource1.lock.tryLock();
            boolean gotSecondLock = resource2.lock.tryLock();

            if (gotFirstLock && gotSecondLock)  break;
            if (gotFirstLock)   resource1.lock.unlock();
            if (gotSecondLock)  resource2.lock.unlock();

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " acquired " + resource1.resourceName + "'s capacity of " + resource1.capacity + " GB \n");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " acquired " + resource2.resourceName + "'s capacity of " + resource2.capacity + " GB \n");
            System.out.println(Thread.currentThread().getName() + " finished working.....\n");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted !!\n");
        }finally {
            resource1.lock.unlock();
            resource2.lock.unlock();
        }
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Resource resource1 = new Resource(20, "Resource 1", new ReentrantLock());
        Resource resource2 = new Resource(8, "Resource 2", new ReentrantLock());

        Thread thread1 = new Thread(() -> {
            Resource.getCapacity(resource1, resource2);
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            Resource.getCapacity(resource2, resource1);
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }
}