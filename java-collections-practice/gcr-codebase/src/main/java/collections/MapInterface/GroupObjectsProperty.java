package collections.MapInterface;
import java.util.*;

public class GroupObjectsProperty {
    static class Employee {
        String name;
        String department;
        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee emp : employees) {
            deptMap.computeIfAbsent(emp.department, d -> new ArrayList<>()).add(emp);
        }
        return deptMap;
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Muskan", "HR"),
            new Employee("Harsh", "IT"),
            new Employee("Parag", "HR")
        );

        Map<String, List<Employee>> result = groupByDept(employees);

        result.forEach((dept, emps) -> System.out.println(dept + " : " + emps));
    }
}
