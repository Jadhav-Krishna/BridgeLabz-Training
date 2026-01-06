package org.scenario.FitTrack;

public class CardioWorkout extends Workout{
	private static final int CARDIO_CALORIE_RATE = 500;

	public CardioWorkout(String type, int duration){
		super(type, duration, CARDIO_CALORIE_RATE);
	}

	@Override
	public int calculateCalories() {
		int base = super.calculateCalories();
		return (int)(base * 1.1);
	}
}
