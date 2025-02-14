public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // Default constructor
    public Employee() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.designation = "Software Developer Trainee";
    }

    // Parameterized constructor
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // Copy constructor
    public Employee(Employee emp) {
        this.firstName = emp.firstName;
        this.lastName = emp.lastName;
        this.age = emp.age;
        this.designation = emp.designation;
    }

    public void setFName(String firstName) {
        this.firstName = firstName;
    }

    public void setLName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesg(String designation) {
        this.designation = designation;
    }

    public String toString() {
        return "Employee Details: " +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age +
                "\nDesignation: " + designation;
    }

    public static void main(String[] args) {
        // default constructor
        Employee emp1 = new Employee();
        System.out.println("\nDefault Constructor");
        System.out.println(emp1);

        // parameterized constructor
        System.out.println("\n\nParameterized Constructor");
        Employee emp2 = new Employee("Kunal", "Rawat", 23, "Software Developer Trainee");
        System.out.println("\n"+emp2);

        // copy constructor
        Employee emp3 = new Employee(emp2);
        System.out.println("\n\nCopy Constructor");
        System.out.println("\nCopied Employee:\n" + emp3);

        // using setter
        emp3.setFName("Deepika");
        emp3.setLName("Raani");
        emp3.setAge(21);
        emp3.setDesg("Senior Software Developer");
        System.out.println("\n\nUsing Setters");
        System.out.println("\nUpdated Employee:\n" + emp3);
    }
}