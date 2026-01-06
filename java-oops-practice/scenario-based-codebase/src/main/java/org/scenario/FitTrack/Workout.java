package org.scenario.FitTrack;

public class Workout implements ITrackable {
	private String type;
	private int duration;
	private int calorieBurnRatePerHour;
	private int caloriesBurned;

	public Workout(String type, int duration, int calorieBurnRatePerHour){
		this.type = type;
		this.duration = duration;
		this.calorieBurnRatePerHour = calorieBurnRatePerHour;
	}

	public String getType() {
		return type;
	}

	public int getDuration() {
		return duration;
	}

	public int calculateCalories() {
		return (duration * calorieBurnRatePerHour) / 60;
	}

	public int remainingCalories(int dailyTarget) {
		return dailyTarget - caloriesBurned;
	}

	@Override
	public int startWorkout() {
		caloriesBurned = calculateCalories();
		return caloriesBurned;
	}

	@Override
	public int stopWorkout() {
		return caloriesBurned;
	}
}
