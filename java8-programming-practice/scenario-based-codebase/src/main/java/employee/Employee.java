package employee;

public class Employee {
	int id;
	private String name;
	private int age;
	private char gender;
	private String department;
	private String yearOfJoining;
	private Double salary;
	
	Employee(int id, String name, int age, char gender, String department, String yearOfJoining, Double salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return department;
	}

	public String getYearOfJoining() {
		return yearOfJoining;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


}
