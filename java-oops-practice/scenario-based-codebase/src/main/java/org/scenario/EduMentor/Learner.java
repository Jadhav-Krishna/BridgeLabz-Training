package org.scenario.EduMentor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learner extends User {
	private final List<Course> courses = new ArrayList<>();

	public Learner(String name, String email, int userId){
		super(name, email, userId);
	}
	
	public void enrollInCourse(Course course) {
		if (course != null) {
			courses.add(course);
		}
	}

	public List<Course> getCourses() {
		return Collections.unmodifiableList(courses);
	}
}
