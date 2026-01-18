package org.scenario.CropMonitor;

public class Main {
    public static void main(String[] args) {
        int[] timestamps = {105, 20, 300, 150, 60};
        CropMonitor monitor = new CropMonitor();
        monitor.quickSort(timestamps, 0, timestamps.length - 1);
        for (int t : timestamps) {
            System.out.print(t + " ");
        }
    }
}
