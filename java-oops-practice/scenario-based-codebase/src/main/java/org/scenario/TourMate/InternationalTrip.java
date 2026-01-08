package org.scenario.TourMate;

class InternationalTrip extends Trip {

    InternationalTrip(String destination, int duration,
                      Transport t, Hotel h, Activity a) {
        super(destination, duration, t, h, a);
    }

    public void book() {
        System.out.println("International trip booked to " + destination);
        System.out.println("Passport & Visa verified");
        System.out.println("Total Budget = " + budget);
    }
}
