package org.scenario.FitTrack;

public class StrengthWorkout extends Workout{
	private static final int STRENGTH_CALORIE_RATE = 350;

	public StrengthWorkout(String type, int duration){
		super(type, duration, STRENGTH_CALORIE_RATE);
	}

	@Override
	public int calculateCalories() {
		int base = super.calculateCalories();
		return base + 50;
	}
}
