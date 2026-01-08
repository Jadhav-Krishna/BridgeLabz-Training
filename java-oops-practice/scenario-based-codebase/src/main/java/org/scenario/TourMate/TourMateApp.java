package org.scenario.TourMate;

public class TourMateApp {

    public static void main(String[] args) {

        Transport t = new Transport(15000);
        Hotel h = new Hotel(25000);
        Activity a = new Activity(10000);

        Trip trip1 = new DomesticTrip("Goa", 5, t, h, a);
        trip1.book();

        Trip trip2 = new InternationalTrip("Paris", 7, t, h, a);
        trip2.book();
    }
}
