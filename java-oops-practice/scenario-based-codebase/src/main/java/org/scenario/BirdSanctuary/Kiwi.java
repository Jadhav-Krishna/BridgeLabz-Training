package org.scenario.BirdSanctuary;

class Kiwi extends Bird {
    Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }
    public void info() {
        System.out.println(getName() + " | Kiwi | Cannot fly or swim");
    }
}
