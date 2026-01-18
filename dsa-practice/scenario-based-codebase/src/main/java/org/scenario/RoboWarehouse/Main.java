package org.scenario.RoboWarehouse;

public class Main {
    public static void main(String[] args) {
        int[] weights = {50, 30, 40, 20, 60};
        RoboWarehouse robot = new RoboWarehouse();
        robot.insertionSort(weights);
        for (int w : weights) {
            System.out.print(w + " ");
        }
    }
}