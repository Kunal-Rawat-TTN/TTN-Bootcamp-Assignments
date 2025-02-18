public class Question_3 {
    public volatile boolean flag = false;

    public void infiniteThreadLoop()
    {
        int count=0;
        while(!this.flag)
        {
            try
            {
                Thread.sleep(500);
                System.out.println("Count :- "+ ++count);
            } catch (InterruptedException e) {
                System.out.println("Infinite Thread Loop Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " Terminated!");
    }
    public void setFlag() {
        try {
            Thread.sleep(2000);
            this.flag = true;
            System.out.println(Thread.currentThread().getName() + " set flag to true!");
        } catch (InterruptedException e) {
            System.out.println("setFlag Thread interrupted !!\n");
        }
    }

    public static void main(String[] args) {
        Question_3 question3= new Question_3();
        Thread infiniteLoopThread = new Thread(question3::infiniteThreadLoop,"Infinite-Loop-Thread");
        Thread setFlagThread = new Thread(question3::setFlag, "Set-Flag-Thread");

        infiniteLoopThread.start();
        setFlagThread.start();
    }
}
