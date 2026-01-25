package generics.AIDrivenResumeScreeningSystem;

class ScreeningService {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {

        System.out.println("\n Screening Resume...");
        System.out.println("Candidate: " + resume.getCandidateName());
        System.out.println("Role Applied: " + resume.getJobRole().getRoleName());
        System.out.println("Experience: " + resume.getExperience() + " years");
        System.out.println("Required Skills: " + resume.getJobRole().getSkillSet());
        System.out.println("Evaluation Model: " + resume.getJobRole().getEvaluationCriteria());

        if(resume.getExperience() >= 2){
            System.out.println("AI Result: Shortlisted");
        } else {
            System.out.println("AI Result: Rejected");
        }
    }
}
