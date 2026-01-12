package org.scenario.AmbulanceRoute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.showUnits();

        route.sendPatient();

        route.removeUnit("Radiology");

        route.showUnits();
    }
}
