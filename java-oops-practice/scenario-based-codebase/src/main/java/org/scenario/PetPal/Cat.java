package org.scenario.PetPal;

public class Cat extends Pet implements IInteractable {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public Cat(String name, int age, int hunger, int mood, int energy) {
        super(name, "Cat", age, hunger, mood, energy);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating.");
        changeHunger(-15);
        changeMood(10);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
        changeEnergy(-10);
        changeHunger(8);
        changeMood(12);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        changeEnergy(20);
        changeHunger(4);
    }
}

