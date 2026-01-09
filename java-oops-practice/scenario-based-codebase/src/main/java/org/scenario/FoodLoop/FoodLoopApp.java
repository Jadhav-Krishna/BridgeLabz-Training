package org.scenario.FoodLoop;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem p1 = new VegItem("Dosa", 250, 5);
        FoodItem p2 = new NonVegItem("Butter Chicken", 300, 3);

        Order order = new Order(p1, p2);
        order.placeOrder();
    }
}

