package org.scenario.PetPal;

public class Dog extends Pet implements IInteractable {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public Dog(String name, int age, int hunger, int mood, int energy) {
        super(name, "Dog", age, hunger, mood, energy);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
        changeHunger(-20);
        changeMood(5);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
        changeEnergy(-15);
        changeHunger(10);
        changeMood(15);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        changeEnergy(25);
        changeHunger(5);
    }
}

