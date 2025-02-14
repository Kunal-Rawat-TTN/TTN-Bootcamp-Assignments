import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question_3 {
    public static void main(String[] args) {
        List<String> listOfAllNames= List.of("Kunal", "Akshat","Manvi","Krishna","Kunal", "Akshat");
        System.out.println(listOfAllNames);

        Set<String> listOfUniqueNames= Set.of("Kunal", "Akshat","Manvi","Krishna");
        System.out.println(listOfUniqueNames);

        Map<String, Integer> listOfNamesAndMarks= Map.of("Kunal",97, "Akshat",99,"Manvi",98,"Krishna",96);
        System.out.println(listOfNamesAndMarks);

    }
}
