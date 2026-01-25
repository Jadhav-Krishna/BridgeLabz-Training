package generics.multiLevelUniversityCourseManagementSystem;

public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> c1 =
            new Course<>("Data Structures", "CSE", new ExamCourse());

        Course<AssignmentCourse> c2 =
            new Course<>("Web Development", "IT", new AssignmentCourse());

        Course<ResearchCourse> c3 =
            new Course<>("AI Research", "CSE", new ResearchCourse());

        CourseManager manager = new CourseManager();

        manager.addCourse(c1);
        manager.addCourse(c2);
        manager.addCourse(c3);

        System.out.println("University Courses");
        manager.showAllCourses();
    }
}
