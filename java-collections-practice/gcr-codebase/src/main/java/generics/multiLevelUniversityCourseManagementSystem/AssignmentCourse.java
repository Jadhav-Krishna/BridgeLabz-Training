package generics.multiLevelUniversityCourseManagementSystem;

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }

    public String getTypeName() {
        return "Assignment Course";
    }
}