package companydepartments;
import java.util.*;
public class Department {
    String departmentName;
    List<Employee> employees;

    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showDepartmentDetails() {
        System.out.println(" Department: " + departmentName);
        for (Employee e : employees) {
            System.out.println("  Employee: " + e.employeeName);
        }
    }
}
