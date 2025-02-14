@FunctionalInterface
interface StudentCreationInterface
{
    Student setDetails(int rollNo, int marks, String name);
}
class Student
{
    String name;
    int marks;
    int rollNo;

    Student(int rollNo, int marks, String name)
    {
        this.rollNo=rollNo;
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "\n\nRoll No :- "+this.rollNo+"\nName :- "+this.name+"\nMarks :- "+this.marks;
    }
}
public class Question_4 {
    public static void main(String[] args) {
        StudentCreationInterface studentCreation = Student::new;
        Student student1 = studentCreation.setDetails(1, 97, "Kunal Rawat");
        Student student2 = studentCreation.setDetails(2, 99, "Akshat Shrivastav");
        Student student3 = studentCreation.setDetails(3, 98, "Manvi Jain");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
