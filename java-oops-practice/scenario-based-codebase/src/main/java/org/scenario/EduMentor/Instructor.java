package org.scenario.EduMentor;

public class Instructor extends User implements ICertificate {
	private final CourseType courseType;

	public Instructor(String name, String email, int userId, CourseType courseType){
		super(name, email, userId);
		this.courseType = courseType;
	}

	@Override
	public void generateCertificate() {
		if (courseType == CourseType.PART_TIME) {
			System.out.println("Short course certificate generated for: " + getName());
		} else {
			System.out.println("Full-time course certificate generated for: " + getName());
		}
	}
}
