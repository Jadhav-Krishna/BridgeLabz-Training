package org.scenario.MedWarehouse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] expiryDates = {25, 12, 30, 18, 10, 22};

        System.out.println("Before Sorting: " + Arrays.toString(expiryDates));
        MedWarehouseMergeSort.mergeSort(expiryDates, 0, expiryDates.length - 1);
        System.out.println("After Sorting:  " + Arrays.toString(expiryDates));
    }
}
