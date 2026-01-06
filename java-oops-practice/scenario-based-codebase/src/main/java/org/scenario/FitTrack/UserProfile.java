package org.scenario.FitTrack;

public class UserProfile {
	private String name;
	private int age;
	private double weight; 
	private String goal;
	private int dailyCalorieTarget;

	public UserProfile(String name, int age, double weight, String goal) {
		this(name, age, weight, goal, 2000);
	}

	public UserProfile(String name, int age, double weight, String goal, int dailyCalorieTarget) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.dailyCalorieTarget = dailyCalorieTarget;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGoal() {
		return goal;
	}

	public int getDailyCalorieTarget() {
		return dailyCalorieTarget;
	}

	public double getWeight() {
		return weight;
	}

	public void updateGoal(String newGoal) {
		this.goal = newGoal;
	}
}
