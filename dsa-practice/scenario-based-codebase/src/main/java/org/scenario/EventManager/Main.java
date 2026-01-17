package org.scenario.EventManager;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1200, 500, 3000, 800, 1500};
        EventManager em = new EventManager();
        em.quickSort(prices, 0, prices.length - 1);
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
