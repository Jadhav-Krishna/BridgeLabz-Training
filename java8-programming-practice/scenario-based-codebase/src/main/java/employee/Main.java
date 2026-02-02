package employee;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee(1, "Shna", 27, 'F', "HR", "2015", 50000.0),
				new Employee(2, "Harsh", 35, 'M', "Finance", "2012", 60000.0),
				new Employee(3, "Abhijeet", 28, 'M', "IT", "2018", 70000.0),
				new Employee(4, "Muskan", 32, 'F', "Marketing", "2014", 55000.0),
				new Employee(5, "Anuj", 40, 'M', "IT", "2010", 80000.0)
				);
		
//		How many male and female employees are there in the organization ?
		Map<Character, Long> countByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(countByGender);

//		Print the name of all departments in the organization ?
		List<String> departments = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(departments);

//		What is the average age of male and female employees ?
		Map<Character, Double> averageAgeByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageAgeByGender);
		
//		Get the details of highest paid employee in the organization ?
		employeeList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

//		Get the names of all employees who have joined after 2015 ?
		List<String> joined2015 =  employeeList.stream().filter(e -> Integer.parseInt(e.getYearOfJoining())>=2015).map(Employee::getName).collect(Collectors.toList());
		System.out.println(joined2015);
		
//		Count the number of employees in each department ?
		Map<String, Long> employeeDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(employeeDepartment);
		
//		What is the average salary of each department ?
		Map<String,Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		
//		Get the details of youngest male employee in the product development department ?
		employeeList.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
		
//		Who has the most working experience in the organization?
		employeeList.stream().min(Comparator.comparing(e -> Integer.parseInt(e.getYearOfJoining()))).ifPresent(System.out::println);
		
	}

}
