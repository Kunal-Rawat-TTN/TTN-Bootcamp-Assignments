@FunctionalInterface
interface PrintInterface {
    abstract void print();
}

interface MessageInterface
{
    default void welcomeMessage()
    {
        System.out.println("Hello !! Kunal !!");
    }
    static void departureMessage()
    {
        System.out.println("Bye !! Kunal !!");
    }
}

public class Question_2 implements MessageInterface{
    public static void main(String[] args) {
        Question_2 msg = new Question_2();

        //Using Java 7
        msg.welcomeMessage();
        MessageInterface.departureMessage();

        System.out.println();

        //Using Java 8, method reference
        PrintInterface welcomePrint=msg::welcomeMessage;
        PrintInterface departurePrint = MessageInterface::departureMessage;
        welcomePrint.print();
        departurePrint.print();

    }
}
