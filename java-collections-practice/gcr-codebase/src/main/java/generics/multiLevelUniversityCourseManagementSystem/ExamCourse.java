package generics.multiLevelUniversityCourseManagementSystem;

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }

    public String getTypeName() {
        return "Exam Course";
    }
}