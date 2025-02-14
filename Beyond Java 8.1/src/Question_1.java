import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question_1 {
    public static void main(String[] args) {
        //using seed, predicate, unary operator(Function)
        Stream<Integer> streamOfInteger = Stream
                .iterate(0, i -> i < 3, i -> ++i);
        streamOfInteger.forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        //using IntStream then boxing them to stream
        Stream<Integer> integerStream = IntStream
                .iterate(4,i->i<9,i->++i).boxed();
        integerStream.forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        //using seed, unary operator and limit
        Stream.iterate(10,i->++i).limit(5).forEach(System.out::println);
    }
}
