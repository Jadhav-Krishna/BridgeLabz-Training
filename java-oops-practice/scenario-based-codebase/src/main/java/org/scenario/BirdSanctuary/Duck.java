package org.scenario.BirdSanctuary;

class Duck extends Bird implements Flyable, Swimmable {

    Duck(String id, String name) {
        super(id, name, "Duck");
    }
    public void fly() {
        System.out.println(getName() + " is flying");
    }
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
    public void info() {
        System.out.println(getName() + " | Duck | Fly + Swim");
    }
}
