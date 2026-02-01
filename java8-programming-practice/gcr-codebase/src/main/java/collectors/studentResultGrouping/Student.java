package collectors.studentResultGrouping;

public class Student {
	private String name;
	private char grade;
	
	public Student(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

}
