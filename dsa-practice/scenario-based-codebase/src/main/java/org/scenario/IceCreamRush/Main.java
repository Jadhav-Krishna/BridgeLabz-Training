package org.scenario.IceCreamRush;

public class Main {
    public static void main(String[] args) {
        int[] sales = {120, 90, 200, 150, 80};
        IceCreamRush shop = new IceCreamRush();
        shop.bubbleSort(sales);
        for (int s : sales) {
            System.out.print(s + " ");
        }
    }
}
