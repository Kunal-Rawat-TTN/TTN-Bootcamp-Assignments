import java.util.Scanner;

class SpecialStack
{
    public int size;
    public int top=-1;
    public int[] getMinStack;
    public int minStack=-1;
    public int[] arr;
    SpecialStack(int size)
    {
        this.size=size;
        arr=new int[size];
        getMinStack= new int[size];
    }
    void push(int i)
    {
        if(isFull())
            System.out.println("Cannot input another element !! Stack Full !!");
        else {
            arr[++top] = i;
            System.out.println("\nPushing :- "+i);
            if(minStack==-1 || getMinStack[minStack]>i) getMinStack[++minStack]=i;
        }
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean isFull()
    {
        return (top+1>=size);
    }
    void pop()
    {
        if(isEmpty())
            System.out.println("Cannot pop any element !! Stack Empty !!");
        else
        {
            System.out.println("\nPopping :- "+arr[top]);
            if(arr[top--]==getMinStack[minStack]) minStack--;
        }
    }

    public int getMin() {
        if(minStack==-1)
            throw new RuntimeException("Min Stack is empty");

        return getMinStack[minStack];
    }

    @Override
    public String toString() {
        if (top == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the max capacity of stack :- ");
        int n= sc.nextInt();

        //creating a new stack of size n
        SpecialStack st= new SpecialStack(n);

        //checking if stack empty
        System.out.println("\nIs stack empty ? "+st.isEmpty());
        st.pop();                                                   //popping element

        st.push(10);                                             //Pushing element
        System.out.println("\nMinimum in stack :- "+st.getMin());

        st.push(6);
        System.out.println("Minimum in stack :- "+st.getMin());

        st.push(2);
        System.out.println("Minimum in stack :- "+st.getMin());

        System.out.println("\nSize of stack :- "+(int)(st.top+1));  //Size of the stack
        st.push(1);

        System.out.println("\nMinimum in stack :- "+st.getMin());   //Min in the stack
        st.push(8);

        System.out.println("Minimum in stack :- "+st.getMin());
        st.push(8);

        System.out.println("\n"+st);                                //Printing the stack

        st.pop();                                                   //popping element
        System.out.println("\nMinimum in stack :- "+st.getMin());
        st.pop();                                                   //popping element
        System.out.println("Minimum in stack :- "+st.getMin());
        st.pop();                                                   //popping element
        System.out.println(st);
    }

}
