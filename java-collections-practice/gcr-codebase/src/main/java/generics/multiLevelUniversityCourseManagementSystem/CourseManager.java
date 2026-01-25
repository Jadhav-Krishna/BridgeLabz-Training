package generics.multiLevelUniversityCourseManagementSystem;

import java.util.*;

class CourseManager {

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showAllCourses() {
        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getCourseName() + " : " + c.getDepartment() + " : " + c.getCourseType().getTypeName() + " : " + c.getCourseType().getEvaluationType()
            );
        }
    }
}
