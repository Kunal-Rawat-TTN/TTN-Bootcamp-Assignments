interface Parent1
{
    default void display()
    {
        System.out.println("Hi, From the Parent 1 ");
    }
}
interface Parent2
{
    default void display()
    {
        System.out.println("Hi, From the Parent 2 ");
    }
}
public class Question_3 implements Parent1, Parent2{
    public void display()
    {
        Parent1.super.display();
        System.out.println("Hi, From the child ");
    }
    public static void main(String[] args) {
        Question_3 q1= new Question_3();
        q1.display();
    }
}
