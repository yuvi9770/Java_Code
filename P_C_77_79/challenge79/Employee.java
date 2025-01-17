package P_C_77_79.challenge79;

public class Employee {
    private String name;
    private int age;
    private double salary;

    String EmployeeDetails() {
        return "EmployeeDetails: [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
