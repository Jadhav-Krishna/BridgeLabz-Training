package generics.personalizedMealPlanGenerator;

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public String getDietInfo() {
        return "Plant-based + dairy allowed";
    }
}