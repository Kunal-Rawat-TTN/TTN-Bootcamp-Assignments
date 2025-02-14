import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question_2 {
    public static void main(String[] args) {
        List<String> listOfNames= Arrays.asList("Kunal","Akshat","Kunali","Kushagra", "Manvi");
        Optional<String> nameStartingK=listOfNames.stream().filter(a->a.startsWith("K")).findAny();
        System.out.println(nameStartingK);
        nameStartingK.stream().forEach(System.out::println);
    }
}
