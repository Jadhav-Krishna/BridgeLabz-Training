package org.scenario.PetPal;

import java.util.concurrent.ThreadLocalRandom;

public class Pet {
    private String name;
    private String type;
    private int age;
    private int hunger;
    private int mood;
    private int energy;

    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = clamp(hunger);
        this.mood = clamp(mood);
        this.energy = clamp(energy);
    }

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 30 + ThreadLocalRandom.current().nextInt(0, 21);
        this.mood = 50 + ThreadLocalRandom.current().nextInt(0, 31);
        this.energy = 50 + ThreadLocalRandom.current().nextInt(0, 31);
    }

    private int clamp(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }

    protected void changeHunger(int amount) {
        hunger = clamp(hunger + amount);
    }

    protected void changeMood(int amount) {
        mood = clamp(mood + amount);
    }

    protected void changeEnergy(int amount) {
        energy = clamp(energy + amount);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    public int getMood() {
        return mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void showStatus() {
        System.out.println("Pet: " + name + " (" + type + ")");
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
        System.out.println();
    }
}

