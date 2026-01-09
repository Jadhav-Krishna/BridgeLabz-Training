package org.scenario.FoodLoop;

import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();

    Order(FoodItem... foodItems) {
        for (FoodItem item : foodItems) {
            if (item.isAvailable()) {
                items.add(item);
                item.reduceStock();
            }
        }
    }

    double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return applyDiscount(total);
    }

    double applyDiscount(double total) {
        if (total > 500) return total * 0.9;
        if (total > 300) return total * 0.95;
        return total;
    }

    public void placeOrder() {
        System.out.println("Order placed. Total = " + calculateTotal());
    }

    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
}

