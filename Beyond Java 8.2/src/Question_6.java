import java.util.*;

public class Question_6 {
    public static void main(String[] args) {
        SequencedSet<Integer> sequencedSet = new LinkedHashSet<>(Arrays.asList(1,2,3,4,1));

        System.out.println("Original set is : " + sequencedSet);

        //add first and last
        sequencedSet.addFirst(0);
        sequencedSet.addLast(5);
        System.out.println("First and last elements added :- " + sequencedSet);

        //remove first and last
        sequencedSet.removeFirst();
        sequencedSet.removeLast();
        System.out.println("First and last elements removed :- " + sequencedSet);

        //get first and last from set
        System.out.println("First element in the set is :- " + sequencedSet.getFirst());
        System.out.println("Last element in the set is :- " + sequencedSet.getLast());

        //reverse the set
        System.out.println("Set in Reverse order :- " + sequencedSet.reversed());


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("\nOriginal list is :- " + list);

        //add first and last
        list.addFirst(0);
        list.addLast(6);
        System.out.println("First and last elements added :- " + list);

        //remove first and last
        list.removeFirst();
        list.removeLast();
        System.out.println("First and last elements removed :- " + list);

        //get first and last from list
        System.out.println("First element in the list is :- " + list.getFirst());
        System.out.println("Last element in the list is :- " + list.getLast());

        //reverse the list
        System.out.println("List in Reverse order :- " + list.reversed());
    }
}
