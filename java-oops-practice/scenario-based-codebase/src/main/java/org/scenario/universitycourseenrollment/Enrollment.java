package org.scenario.universitycourseenrollment;

public class Enrollment implements Graded {
    private Student student;
    private Course course;
    private double grade;

    public Enrollment(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String assignGrade() {
        // Simple pass/fail logic based on GPA and grade
        boolean passed = grade >= 50 && student.getGpa() >= 2.0;
        return passed ? "Pass" : "Fail";
    }

    public String enrollmentSummary() {
        return "Enrollment{" +
                "student=" + student.getName() +
                ", course=" + course.getName() +
                ", grade=" + grade +
                ", result=" + assignGrade() +
                '}';
    }
}
