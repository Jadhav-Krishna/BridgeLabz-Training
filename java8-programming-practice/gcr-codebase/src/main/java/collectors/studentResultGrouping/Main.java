package collectors.studentResultGrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> student = List.of(new Student("Rahul", 'A'),new Student("Amit", 'B'),new Student("Sneha", 'A'),new Student("Priya", 'B'),new Student("Kiran", 'C'));
		
		Map<Character, List<String>> result = student.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName, Collectors.toList())));

		System.out.println(result);
	}

}
