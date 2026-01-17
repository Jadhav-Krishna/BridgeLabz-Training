package org.scenario.IceCreamRush;

class IceCreamRush {
    void bubbleSort(int[] sales) {
        int n = sales.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] > sales[j + 1]) {
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;
                }
            }
        }
    }
}
