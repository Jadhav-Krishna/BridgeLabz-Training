package generics.personalizedMealPlanGenerator;

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public String getDietInfo() {
        return "Low-carb, High-fat";
    }
}