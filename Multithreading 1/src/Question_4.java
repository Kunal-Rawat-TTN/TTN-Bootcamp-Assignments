class Resource
{
    int capacity;
    String resourceName;
    Resource(int capacity, String resourceName)
    {
        this.capacity=capacity;
        this.resourceName=resourceName;
    }

    public static void getCapacity(Resource resource1, Resource resource2)
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" trying to get "+resource1.resourceName+"......\n");
            synchronized (resource1)
            {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+" acquired "+resource1.resourceName+"'s capacity of "+resource1.capacity+" GB \n");
                System.out.println(Thread.currentThread().getName()+" waiting for  "+resource2.resourceName+".....\n");

                synchronized (resource2)
                {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName()+" acquired "+resource2.resourceName+"'s capacity of "+resource2.capacity+" GB \n");
                }
                System.out.println(Thread.currentThread().getName()+" finished working.....\n");
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName()+" interrupted !!\n");
        }
    }
}
public class Question_4 {
    public static void main(String[] args) {
        Resource resource1 = new Resource(20,"Resource 1");
        Resource resource2 = new Resource(8, "Resource 2");

        Thread thread1= new Thread(()-> {
            Resource.getCapacity(resource1,resource2);
        }, "Thread 1");

        Thread thread2= new Thread(()-> {
            Resource.getCapacity(resource2,resource1);
        },"Thread 2");

        thread1.start();
        thread2.start();
    }
}
