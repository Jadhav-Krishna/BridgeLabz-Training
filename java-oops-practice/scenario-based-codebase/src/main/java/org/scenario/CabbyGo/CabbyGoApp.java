package org.scenario.CabbyGo;

public class CabbyGoApp {

    public static void main(String[] args) {

        Vehicle mini = new Mini("MP12-MF-1010");
        Vehicle sedan = new Sedan("MH12-DH-2920");
        Vehicle suv = new SUV("MH04-EF-3037");

        Driver driver = new Driver("Ramesh", "LIC4567", 4.8);

        Ride ride1 = new Ride(mini, driver, 10);
        ride1.bookRide();
        ride1.endRide();

        Ride ride2 = new Ride(suv, driver, 8);
        ride2.bookRide();
        ride2.endRide();
    }
}
