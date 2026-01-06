package org.scenario.CampusConnect;
import java.util.*;
public class Course {
	private String courseName;
	private Faculty faculty;
	List<Student> students = new ArrayList<>();
	
    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }
    
    void addStudent(Student s) {
        students.add(s);
    }

    void removeStudent(Student s) {
        students.remove(s);
    }

    void printCourseDetails() {
        System.out.println("Course: " + courseName);
        faculty.printDetails();
        for (Student s : students) {
            s.printDetails();
        }
    }
}
