import java.util.ArrayList;
import java.util.List;

class employee
{
    Integer id;
    String name;
    Float salary;
    employee(){

    }
    employee(Integer id, String name, Float salary)
    {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    employee checkA(employee emp1)
    {
        if(emp1.name.startsWith("A"))
            return emp1;
        return null;
    }

    @Override
    public String toString() {
        return "Name "+name;
    }
}
public class Main {

    public static void main(String[] args)
    {
        employee e1= new employee();
        List <employee> list = new ArrayList<>();
        list.add(new employee(1, "Akshat", 999F));
        list.add(new employee(2, "Sakshat", 6878F));
        list.add(new employee(3, "Bhakshat", 900F));
        list.add(new employee(4, "Akshat", 6878F));
        list.stream().map(e1::checkA).forEach(System.out::println);
        System.out.println();


    }

}
