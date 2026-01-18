package org.scenario.BirdSanctuary;

public class Main {
    public static void main(String[] args) {
        BirdSanctuary sanctuary = new BirdSanctuary();
        Bird e1 = new Eagle("B1", "Rocky");
        Bird d1 = new Duck("B2", "Donald");
        Bird p1 = new Penguin("B3", "Pingu");
        Bird k1 = new Kiwi("B4", "KiwiBoy");

        sanctuary.addBird(e1);
        sanctuary.addBird(d1);
        sanctuary.addBird(p1);
        sanctuary.addBird(k1);
        sanctuary.displayAll();
        sanctuary.showFlyingBirds();
        sanctuary.showSwimmingBirds();
        sanctuary.report();
        ReflectionDemo.showMetadata(e1);
    }
}
