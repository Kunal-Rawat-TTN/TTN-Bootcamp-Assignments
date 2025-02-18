class PeopleCount{
    int count;

    public synchronized void increaseCount(int countIncrease) {
        try
        {
            System.out.println(Thread.currentThread().getName()+" Entering Synchronized Method !!");
            System.out.println(Thread.currentThread().getName()+" increasing count by :- "+countIncrease);
            Thread.sleep(2000);
            count+=countIncrease;
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" Interrupted !!\n");
        }
        System.out.println(Thread.currentThread().getName()+" Exiting Synchronized Method !!");
        System.out.println("Current People Count :- "+this.count+"\n");
    }

    public void decreaseCount(int countDecrease)
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName()+" Entering Synchronized Block !!");
            System.out.println(Thread.currentThread().getName()+" decreasing count by :- "+countDecrease);
            try
            {
                Thread.sleep(2000);
                count-=countDecrease;
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" Interrupted !!\n");
            }
            System.out.println(Thread.currentThread().getName()+" Exiting Synchronized Block !!");
            System.out.println("Current People Count :- "+this.count+"\n");
        }
    }
}

public class Question_2 {
    public static void main(String[] args) {
        PeopleCount peopleCount = new PeopleCount();

        Thread increaseCountThread1= new Thread(()-> peopleCount.increaseCount(10));
        Thread increaseCountThread2= new Thread(()-> peopleCount.increaseCount(3));
        Thread decreaseCountThread1= new Thread(()-> peopleCount.decreaseCount(4));
        Thread decreaseCountThread2= new Thread(()-> peopleCount.decreaseCount(6));

        increaseCountThread1.start();
        increaseCountThread2.start();
        decreaseCountThread1.start();
        decreaseCountThread2.start();
    }
}
