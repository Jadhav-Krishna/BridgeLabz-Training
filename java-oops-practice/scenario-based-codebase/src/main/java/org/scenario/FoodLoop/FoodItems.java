package org.scenario.FoodLoop;

class FoodItem {
    private String name;
    private String category;
    protected double price;
    private int stock;

    FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    boolean isAvailable() {
        return stock > 0;
    }

    void reduceStock() {
        if (stock > 0) stock--;
    }

    double getPrice() {
        return price;
    }
}
