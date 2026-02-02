package schoolSystem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolSystem {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Anuj", 32, 101, "Delhi",18),
				new Student("Muskan", 75, 102, "Mumbai",17),
				new Student("Harsh", 23, 103, "Chennai",18),
				new Student("Shna", 64, 104, "Kolkata",20),
				new Student("Abhijeet", 55, 105, "Bangalore",21)
				);
		
//		Use a lambda expression to print a welcome message for a student.
		students.forEach(student -> System.out.println("Welcome " + student.getName() + " to the School System!"));
		
//		Use lambda to check if a student is pass or fail based on marks.
		students.stream().filter(e -> e.getmarks() > 33).forEach(e -> System.out.println(e.getName() + " has passed the exam."));
		
//		Sort students by name using lambda.
		List<Student> sortedStudentsByName = students.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		System.out.println(sortedStudentsByName);
		
//		Sort students by rank using lambda.
		List<Student> rankStudent =  students.stream().sorted((a1,a2) -> Integer.compare(a1.getmarks(), a2.getmarks())).collect(Collectors.toList());
		System.out.println(rankStudent);
		
//		Use lambda to display students whose age is above 18.
		students.stream().filter(e -> e.getAge() > 18).forEach(System.out::println);
		
	}

}
