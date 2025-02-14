@FunctionalInterface
interface ArithmeticInterface
{
    int operation(int a, int b);
}
public class Question_2 {
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    static int multiplication(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        Question_2 q1 =new Question_2();
        ArithmeticInterface addOperation = q1::add;
        ArithmeticInterface subtractOperation = q1::subtract;
        ArithmeticInterface multiplicationOperation = Question_2::multiplication;
        System.out.println("Addition :- "+addOperation.operation(2,6));
        System.out.println("Subtraction :- "+subtractOperation.operation(2,6));
        System.out.println("multiplication :- "+multiplicationOperation.operation(2,6));


    }
}

//interface Dada
//{
//
//}
//@FunctionalInterface
//interface papa extends Dada
//{
//    boolean check(int a);
//}
//@FunctionalInterface
//interface beta extends papa
//{
//    boolean check(int a);
//}