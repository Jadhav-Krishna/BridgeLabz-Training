package org.scenario.TrainCompanion;

public class Main {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1");
        train.addCompartment("C2");
        train.addCompartment("Pantry");
        train.addCompartment("C3");

        train.showAdjacent();

        train.moveNext();
        train.showAdjacent();

        train.removeCompartment("Pantry");

        train.moveNext();
        train.showAdjacent();
    }
}
