import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class Question_5 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Kunal Singh Rawat",2500L,"Delhi"));
        empList.add(new Employee("Kunal Kumar Rawat",2900L,"Agra"));
        empList.add(new Employee("Kunal Singh Kumar",1089L,"Delhi"));
        empList.add(new Employee("Akshat Kumar Srivastava",900L,"Delhi"));
        empList.add(new Employee("Manvi Singh Jain",7000L,"Noida"));
        empList.add(new Employee("Ankur Singh Yadav",2800L,"Delhi"));

        List<String> uniqueFilteredNames=empList.stream()
                .filter(emp -> emp.salary < 5000 && emp.city=="Delhi")
                .map(emp -> emp.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueFilteredNames);
    }
}