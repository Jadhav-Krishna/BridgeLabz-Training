package generics.AIDrivenResumeScreeningSystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer", "Java, DSA, System Design");
    }

    public String getEvaluationCriteria() {
        return "Coding + Problem Solving + Projects";
    }
}