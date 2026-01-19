package org.scenario.FitnessTracker;

public class Main {
    public static void main(String[] args) {
        int[] steps = {8500, 12000, 6400, 9800, 15000};

        FitnessTracker ft = new FitnessTracker();
        ft.bubbleSort(steps);

        for (int s : steps) {
            System.out.print(s + " ");
        }
    }
}
