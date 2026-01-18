package org.scenario.CropMonitor;

class CropMonitor {
    void quickSort(int[] time, int low, int high) {
        if (low < high) {
            int p = partition(time, low, high);
            quickSort(time, low, p - 1);
            quickSort(time, p + 1, high);
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
