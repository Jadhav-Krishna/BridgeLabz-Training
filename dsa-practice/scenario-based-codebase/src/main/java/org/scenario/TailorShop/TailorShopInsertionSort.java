package org.scenario.TailorShop;

import java.util.Arrays;

public class TailorShopInsertionSort {

    public static void sortByDeadline(int[] deadlines) {
        for (int i = 1; i < deadlines.length; i++) {
            int currentOrder = deadlines[i];
            int j = i - 1;
            while (j >= 0 && deadlines[j] > currentOrder) {
                deadlines[j + 1] = deadlines[j];
                j--;
            }
            deadlines[j + 1] = currentOrder;
        }
    }
}
