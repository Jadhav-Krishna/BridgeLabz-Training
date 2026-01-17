package org.scenario.EventManager;

class EventManager {

    void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int p = partition(prices, low, high);
            quickSort(prices, low, p - 1);
            quickSort(prices, p + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
