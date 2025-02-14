import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Question_7 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> sequencedMap = new LinkedHashMap<>() ;

        sequencedMap.put(1, "Kunal");
        sequencedMap.put(2, "Akshat");
        sequencedMap.put(3, "Manvi");
        sequencedMap.put(4, "Sanchit");

        System.out.println("Original map is :-"+sequencedMap);

        //Getting first and last entry
        System.out.println("First entry in map is :- "+sequencedMap.firstEntry());
        System.out.println("Last entry in map is :- "+sequencedMap.lastEntry());


        //adding value at first and last
        sequencedMap.putFirst(0, "Deepika");
        sequencedMap.putLast(5, "Krishna");
        System.out.println("Added values at first and last position :- " + sequencedMap);

        //removing on the basis of key
        System.out.println("Polling key pair with first key :- "+ sequencedMap.pollFirstEntry());
        System.out.println("Polling key pair with last key :- "+ sequencedMap.pollLastEntry());

        //printing revered map
        System.out.println("Map in Reverse order :- " +sequencedMap.reversed());

    }
}
