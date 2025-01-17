package P_C_77_79.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ram", 54, 12350);
        System.out.println(emp.EmployeeDetails());
        emp.setAge(12);

        System.out.println(emp.EmployeeDetails());
    }
}
