package P_C_113_115.c_114;

import java.util.List;

public class SortingEmp {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Rama", 19200),
            new Employee("Jay", 1400),
            new Employee("Viki", 1150),
            new Employee("Luv", 12020),
            new Employee("Raj", 12284)
        );

        employees.stream()
        .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
        .forEach(System.out :: println);
    }
}
