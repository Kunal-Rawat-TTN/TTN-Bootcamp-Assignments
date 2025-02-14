import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question_1 {
    public static void main(String[] args) {

        Consumer<String> printMessage = x -> System.out.println(x);
        Supplier <Integer> generateRandomNumber = () -> (int) (Math.random()*20);

        Predicate <Integer> isEven = x -> (((int)x)&1)==0;
        Function<Integer,Integer> generateSquare = x -> x*x;

        printMessage.accept("Hello Kunal !!");
        System.out.println("Random Generated Number :- "+generateRandomNumber.get());
        System.out.println("Is Even :- "+isEven.test(6));
        System.out.println("Generated Square :- "+generateSquare.apply(4));
    }
}
