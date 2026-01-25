package generics.personalizedMealPlanGenerator;

class MealService {

    public static <T extends MealPlan> Meal<T> generateMealPlan(String user, T plan) {

        if(plan == null){
            throw new IllegalArgumentException("Invalid Meal Plan Type");
        }

        System.out.println("Generating meal plan for: " + user);
        System.out.println("Meal Type: " + plan.getMealType());
        System.out.println("Diet Info: " + plan.getDietInfo());

        return new Meal<>(user, plan);
    }
}
