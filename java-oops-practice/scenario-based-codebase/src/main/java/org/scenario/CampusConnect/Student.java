package org.scenario.CampusConnect;

public class Student extends Person implements ICources {
	int[] grade;

	Student(int id, String name, String email,int[] grade){
		super(id, name, email);
		this.grade = grade;
	}
	
	double calculateGPA() {
		int sum = 0;
		for(int g : grade) {
			sum += g;
		}
		return (double)sum/grade.length;
	}
	
	@Override
	public void enrollCourse(Course course) {
		course.addStudent(this);
	}

	@Override
	public void dropCourse(Course course) {
		course.removeStudent(this);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student Name : "+ personName + ", GPA: "+ calculateGPA());
	}
}
