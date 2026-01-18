package org.scenario.BirdSanctuary;

class Penguin extends Bird implements Swimmable {
    Penguin(String id, String name) {
        super(id, name, "Penguin");
    }
    public void swim() {
        System.out.println(getName() + " is swimming fast");
    }
    public void info() {
        System.out.println(getName() + " | Penguin | Swim only");
    }
}
