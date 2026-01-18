package org.scenario.BirdSanctuary;

@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
class Eagle extends Bird implements Flyable {
    Eagle(String id, String name) {
        super(id, name, "Eagle");
    }
    public void fly() {
        System.out.println(getName() + " is flying high");
    }
    public void info() {
        System.out.println(getName() + " | Eagle | Flyable");
    }
}
