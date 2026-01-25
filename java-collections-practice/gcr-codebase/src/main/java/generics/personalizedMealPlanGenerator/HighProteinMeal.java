package generics.personalizedMealPlanGenerator;

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public String getDietInfo() {
        return "Protein-rich diet";
    }
}