package org.scenario.PetPal;

public class Bird extends Pet implements IInteractable {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public Bird(String name, int age, int hunger, int mood, int energy) {
        super(name, "Bird", age, hunger, mood, energy);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Chirp!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
        changeHunger(-10);
        changeMood(8);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
        changeEnergy(-8);
        changeHunger(6);
        changeMood(10);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        changeEnergy(18);
        changeHunger(3);
    }
}
