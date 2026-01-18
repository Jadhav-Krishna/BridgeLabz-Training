package org.scenario.BirdSanctuary;
import java.util.*;

class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();
    void addBird(Bird b) {
        birds.add(b);
    }

    void removeBird(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    void displayAll() {
        for (Bird b : birds) {
            b.info();
            b.eat();
        }
    }

    void showFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    void showSwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    void report() {
        int fly = 0, swim = 0, both = 0, none = 0;
        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else none++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }
}
