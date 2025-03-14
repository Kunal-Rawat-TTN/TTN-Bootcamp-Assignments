import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employe {
    String name;
    int age;
    String designation;

    public Employe(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return age == employe.age && Objects.equals(name, employe.name)
                && Objects.equals(designation, employe.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    @Override
    public String toString() {
        return "\nName :- "+name+"\nAge :- "+age+"\nDesignation :- "+designation;
    }
}
public class Question_4 {
    public static void main(String[] args) {
        Map<Employe, Double> employeMap = new HashMap<>();
        Employe emp1=new Employe("Kunal Rawat",23,"Java Developer");
        Employe emp2=new Employe("Krishna Sharma",21,"Java Developer");
        Employe emp3=new Employe("Kanishk",21,"Quality Engineer");
        Employe emp4=new Employe("Kanishk",21,"Quality Engineer");
        employeMap.put(emp1,89982.82);
        employeMap.put(emp2,87827.029);
        employeMap.put(emp3,28273.0);
        employeMap.put(emp4,28273.0);

        for(Map.Entry<Employe, Double> emp: employeMap.entrySet())
        {
            System.out.println(emp.getKey()+"\nSalary :- "+emp.getValue());
        }
    }
}