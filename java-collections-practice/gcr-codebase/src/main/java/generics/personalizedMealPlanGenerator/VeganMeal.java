package generics.personalizedMealPlanGenerator;

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public String getDietInfo() {
        return "100% plant-based";
    }
}