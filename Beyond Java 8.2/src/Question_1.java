import java.util.Objects;

record Student(Integer id, String name, Integer standard)
{
    Student
    {
        Objects.requireNonNull(id,"Id can't be not null");
        Objects.requireNonNull(name,"Name can't be not null");
        Objects.requireNonNull(standard,"Standard can't be not null");
    }

}
public class Question_1 {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Kunal Rawat", 12);
        System.out.println(student1);

        Student student2 = new Student(2, "Akshat Shrivastav", 11);
        System.out.println(student2);

        Student student3 = new Student(1, "Kunal Rawat", 12);
        System.out.println(student3);

        System.out.println("Is Student 1 same as Student 2 ? "+student1.equals(student2));
        System.out.println("Is Student 1 same as Student 3 ? "+student1.equals(student3));

        System.out.println("Hash code of student 1 :- "+student1.hashCode());
        System.out.println("Hash code of student 2 :- "+student2.hashCode());
        System.out.println("Hash code of student 3 :- "+student3.hashCode());
//        Student student3 = new Student(null, "Manvi Jain", 11);
//        System.out.println(student3);

    }
}
