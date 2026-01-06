package org.scenario.SwiftCart;
public class SwiftCartApp {
    public static void main(String[] args) {
        Product apples = new PerishableProduct("Apples", 120.0, "Fruits");
        Product milk = new PerishableProduct("Milk", 60.0, "Dairy");
        Product rice = new NonPerishableProduct("Rice", 500.0, "Grains");
        Product soap = new NonPerishableProduct("Soap", 40.0, "Personal Care");

        Cart cart = new Cart();
        cart.addProduct(apples, 2);
        cart.addProduct(milk, 1);
        cart.addProduct(rice, 1);
        cart.addProduct(soap, 3);

        double total = cart.generateBill();
        double finalTotal = cart.applyDiscount(100.0);

        System.out.println("Total before discount: " + total);
        System.out.println("Total after discount: " + finalTotal);
    }
}

