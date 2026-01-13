package org.scenario.TrafficManager;

public class Main {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.arrive("CAR-1");
        tm.arrive("CAR-2");
        tm.arrive("CAR-3");

        tm.enterRoundabout();
        tm.enterRoundabout();
        tm.enterRoundabout();

        tm.showRoundabout();

        tm.exitRoundabout();
        tm.showRoundabout();
        
        tm.exitRoundabout();
        tm.showRoundabout();
    }
}
