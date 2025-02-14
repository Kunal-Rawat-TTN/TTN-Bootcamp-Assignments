import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_4 {
    public static void main(String[] args) {
        List<String> listOfAllNames= new ArrayList<>(Arrays.asList("Kunal", "Kunali","Akshat","Manvi","Krishna"));

        //using only toList to make unmodifiable list
        List<String> listOfUnmodifiableNames= listOfAllNames.stream()
                .filter(a->a.startsWith("K"))
                .toList();

        //using collect function
        List<String> listOfUnmodifiableNames2= listOfAllNames.stream()
                .filter(a->a.startsWith("K"))
                .collect(Collectors.toUnmodifiableList());

        System.out.println(listOfUnmodifiableNames.getClass());
        System.out.println(listOfUnmodifiableNames2.getClass());

    }
}
