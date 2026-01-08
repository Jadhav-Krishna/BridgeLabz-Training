package org.scenario.TourMate;

class DomesticTrip extends Trip {

    DomesticTrip(String destination, int duration,
                 Transport t, Hotel h, Activity a) {
        super(destination, duration, t, h, a);
    }

    public void book() {
        System.out.println("Domestic trip booked to " + destination);
        System.out.println("Total Budget = " + budget);
    }
}

