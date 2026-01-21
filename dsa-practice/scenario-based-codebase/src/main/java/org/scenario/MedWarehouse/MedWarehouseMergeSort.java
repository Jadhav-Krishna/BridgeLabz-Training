package org.scenario.MedWarehouse;
import java.util.Arrays;


public class MedWarehouseMergeSort {

    public static void mergeSort(int[] expiryDates, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(expiryDates, left, mid);
            mergeSort(expiryDates, mid + 1, right);

            merge(expiryDates, left, mid, right);
        }
    }

    private static void merge(int[] expiryDates, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = expiryDates[left + i];}

        for (int j = 0; j < n2; j++) {
            rightArr[j] = expiryDates[mid + 1 + j];}

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                expiryDates[k++] = leftArr[i++];
            } else {
                expiryDates[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            expiryDates[k++] = leftArr[i++];}

        while (j < n2) {
            expiryDates[k++] = rightArr[j++];}
    }
}
