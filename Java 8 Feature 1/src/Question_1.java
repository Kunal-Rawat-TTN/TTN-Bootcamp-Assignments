@FunctionalInterface
interface CheckInterface
{
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface IncreaseInterface
{
    int increment(int a);
}

@FunctionalInterface
interface ConcatenationInterface
{
    String concatenation(String a, String b);
}

@FunctionalInterface
interface UpperCaseInterface
{
    String toUpper(String s);
}
public class Question_1 {
    public static void main(String[] args) {
        CheckInterface ch = (a,b) -> a>b;
        IncreaseInterface inc = a -> ++a;
        ConcatenationInterface concat= (a,b) -> a+b;
        UpperCaseInterface up = s -> s.toUpperCase();

        System.out.println(ch.isGreater(30,10));
        System.out.println(inc.increment(43));
        System.out.println(concat.concatenation("Hi, Kunal ", "Rawat"));
        System.out.println(up.toUpper("hi, kunal !"));

    }
}
