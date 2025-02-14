import java.util.Optional;

class Student
{
    Integer id;
    Optional<String> name;
    Optional<Integer> marks;
    Student(Integer id)
    {
        this.id=id;
        this.name= Optional.empty();
        this.marks= Optional.empty();
//        this.marks=Optional.ofNullable(null);
//        this.name=Optional.ofNullable(null);
    }
    String getName()
    {
        return this.name.orElse("Unknown");
    }
    Integer getMarks()
    {
        return this.marks.orElse(75);
    }
}
public class Question_4 {
    public static void main(String[] args) {
        Student st1 = new Student(3);
        System.out.println("Student 1 Name :- "+st1.getName());
        System.out.println("Student 1 Marks :- "+st1.getMarks());

        st1.marks=Optional.of(99);
        st1.name=Optional.of("Kunal Rawat");

        System.out.println("Student 1 Name Present :- "+st1.marks.isPresent());

        System.out.println("Student 1 Name :- "+st1.getName());
        System.out.println("Student 1 Marks :- "+st1.getMarks());
    }
}
