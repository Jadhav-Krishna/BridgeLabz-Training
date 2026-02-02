package collectors.employeeSalaryCategorization;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Rahul", "IT", 60000),
                new Employee("Amit", "IT", 70000),
                new Employee("Sneha", "HR", 40000),
                new Employee("Priya", "HR", 50000),
                new Employee("Kiran", "Finance", 70000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> " + avgSalary)
        );
    }
}

