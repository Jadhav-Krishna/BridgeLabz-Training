package org.scenario.FitTrack;

public class FitTrackApp {

	public static void main(String[] args) {
		UserProfile user = new UserProfile("John Doe", 30, 75.0, "Lose weight", 2200);

		Workout cardio = new CardioWorkout("Running", 45);
		Workout strength = new StrengthWorkout("Weight Lifting", 60);

		int cardioCalories = cardio.startWorkout();
		System.out.println("Cardio workout calories burned: " + cardioCalories);
		System.out.println("Remaining calories for the day: " + cardio.remainingCalories(user.getDailyCalorieTarget()));

		int strengthCalories = strength.startWorkout();
		System.out.println("Strength workout calories burned: " + strengthCalories);
		System.out.println("Remaining calories for the day: " + strength.remainingCalories(user.getDailyCalorieTarget()));
	}

}
