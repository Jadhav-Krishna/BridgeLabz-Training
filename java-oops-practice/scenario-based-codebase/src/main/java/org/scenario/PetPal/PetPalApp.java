package org.scenario.PetPal;

public class PetPalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Luna", 2, 40, 70, 60);
        Bird bird = new Bird("Sky", 1);

        System.out.println("Initial status:");
        dog.showStatus();
        cat.showStatus();
        bird.showStatus();

        Pet[] pets = {dog, cat, bird};
        for (Pet pet : pets) {
            pet.makeSound();
        }

        System.out.println("\nInteracting with Buddy the Dog:");
        dog.feed();
        dog.play();
        dog.sleep();
        dog.showStatus();

        System.out.println("Interacting with Luna the Cat:");
        cat.play();
        cat.feed();
        cat.showStatus();

        System.out.println("Interacting with Sky the Bird:");
        bird.feed();
        bird.play();
        bird.sleep();
        bird.showStatus();

        System.out.println("Final summary:");
        for (Pet pet : pets) {
            System.out.print(pet.getName() + " -> ");
            if (pet.getHunger() > 60) {
                System.out.print("hungry ");
            }
            if (pet.getMood() > 70) {
                System.out.print("happy ");
            }
            if (pet.getEnergy() < 30) {
                System.out.print("tired ");
            }
            System.out.println();
        }
    }
}

