package generics.AIDrivenResumeScreeningSystem;

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", "Python, ML, Statistics");
    }

    public String getEvaluationCriteria() {
        return "ML Models + Data Analysis + Research";
    }
}