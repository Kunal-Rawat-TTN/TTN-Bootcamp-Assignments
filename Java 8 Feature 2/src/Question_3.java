import java.util.Arrays;
import java.util.List;

public class Question_3 {
    public static void main(String[] args) {
        List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(
                "Sum of list greater than 5 :- "+listOfNum
                        .stream()
                        .filter(a-> a>5)
                        .reduce(0,(a,b)->a+b)
        );
    }
}
