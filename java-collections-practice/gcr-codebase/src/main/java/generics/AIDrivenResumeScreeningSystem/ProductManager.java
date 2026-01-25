package generics.AIDrivenResumeScreeningSystem;

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", "Business, UX, Strategy");
    }

    public String getEvaluationCriteria() {
        return "Product Thinking + Leadership + Planning";
    }
}