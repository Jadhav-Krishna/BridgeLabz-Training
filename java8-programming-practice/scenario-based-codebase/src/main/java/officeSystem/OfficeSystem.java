package officeSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OfficeSystem {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("Anuj", 50000, 5 ),
				new Employee("Muskan", 60000, 6 ), new Employee("Harsh", 45000, 4),
				new Employee("Shna", 70000, 7 ), new Employee("Abhijeet", 55000, 5 ));

//		Use lambda to calculate employee bonus (salary > 30,000).
		employeeList.stream().filter(e -> e.getSalary() > 30000)
				.forEach(e -> System.out.println("Employee: " + e.getName() + ", Bonus: " + (e.getSalary() * 0.10)));
		
//		Sort employees by salary using lambda.
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
//		Use lambda to check promotion eligibility (experience > 3 years).
		employeeList.stream().filter(e -> (e.getExperience() > 3)).forEach(e -> System.out.println(e.getName() + " " + e.getExperience()));
		
//		Use lambda to print employee details.
		employeeList.forEach(e -> System.out.println(e));
		
//		Use lambda to compare two employees’ salaries.
		employeeList.stream().sorted((a1,a2) -> Double.compare(a1.getSalary(),a2.getSalary())).forEach(System.out::println);
	}

}
