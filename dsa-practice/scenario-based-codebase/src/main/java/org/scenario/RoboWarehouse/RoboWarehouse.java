package org.scenario.RoboWarehouse;

public class RoboWarehouse {
    void insertionSort(int[] weights) {
        for (int i = 1; i < weights.length; i++) {
            int key = weights[i];
            int j = i - 1;
            while (j >= 0 && weights[j] > key) {
                weights[j + 1] = weights[j];
                j--;
            }
            weights[j + 1] = key;
        }
    }
}
