package generics.personalizedMealPlanGenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 = MealService.generateMealPlan("Krishna", new VegetarianMeal());

        Meal<VeganMeal> m2 = MealService.generateMealPlan("Muskan", new VeganMeal());

        Meal<KetoMeal> m3 = MealService.generateMealPlan("Riya", new KetoMeal());

        Meal<HighProteinMeal> m4 = MealService.generateMealPlan("Harsh", new HighProteinMeal());

        System.out.println("\n Personalized Meal Plans ");

        System.out.println(m1.getUserName() + " → " + m1.getMealPlan().getMealType());
        System.out.println(m2.getUserName() + " → " + m2.getMealPlan().getMealType());
        System.out.println(m3.getUserName() + " → " + m3.getMealPlan().getMealType());
        System.out.println(m4.getUserName() + " → " + m4.getMealPlan().getMealType());
    }
}

