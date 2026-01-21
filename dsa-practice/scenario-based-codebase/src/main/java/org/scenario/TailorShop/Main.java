package org.scenario.TailorShop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] orderDeadlines = {10, 12, 15, 18, 13};

        System.out.println("Before Sorting: " + Arrays.toString(orderDeadlines));
        TailorShopInsertionSort.sortByDeadline(orderDeadlines);
        System.out.println("After Sorting:  " + Arrays.toString(orderDeadlines));
    }
}
