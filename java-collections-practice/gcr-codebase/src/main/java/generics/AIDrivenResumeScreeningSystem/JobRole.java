package generics.AIDrivenResumeScreeningSystem;

abstract class JobRole {

    private String roleName;
    private String skillSet;

    public JobRole(String roleName, String skillSet) {
        this.roleName = roleName;
        this.skillSet = skillSet;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public abstract String getEvaluationCriteria();
}
