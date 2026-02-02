package schoolSystem;

public class Student {
	private String name;
	private int marks;
	private int age;
	private int rollNo;
	private String location;
	
	Student(String name, int marks, int rollNo, String location,int age){
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
		this.age = age;
		this.location = location;
		
	}
	
	public String getName() {
		return name;
	}

	public int getmarks() {
		return marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getLocation() {
		return location;
	}
	
	@Override
	public String toString() {
		return "Student{name='" + name + "', marks=" + marks + ", rollNo=" + rollNo + ", location='" + location + "'}";
	}

	public int getAge() {
		return age;
	}

}
