package org.scenario.EduMentor;

public class Course {
	private final String title;
	private final CourseType courseType;

	public Course(String title, CourseType courseType) {
		this.title = title;
		this.courseType = courseType;
	}

	public String getTitle() {
		return title;
	}

	public CourseType getCourseType() {
		return courseType;
	}
}
