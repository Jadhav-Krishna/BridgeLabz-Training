package org.scenario.CinemaHouse;

public class Main {
    public static void main(String[] args) {
        int[] showTimes = {1800, 1500, 2100, 1200, 1700};
        CinemaHouse cinema = new CinemaHouse();
        cinema.bubbleSort(showTimes);
        for (int t : showTimes) {
            System.out.print(t + " ");
        }
    }
}
