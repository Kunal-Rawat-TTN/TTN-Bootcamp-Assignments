import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ClassNotes {
    public static void main(String[] args) {
        Object[] cl= new Object[10];
        List<String> l1 = new ArrayList<>();
        l1.add(1);
        cl[0]='a';
        cl[1]="b";
        cl[2]="c";
        for(Object arr: cl)
        {
            System.out.println(arr);
        }
    }
}
