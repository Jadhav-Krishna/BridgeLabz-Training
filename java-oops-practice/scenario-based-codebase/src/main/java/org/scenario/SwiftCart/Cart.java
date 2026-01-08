package org.scenario.SwiftCart;

import java.util.*;

class Cart implements ICheckout {
    private List<Product> products;
    private double totalPrice;

    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public Cart(List<Product> initialProducts) {
        this.products = new ArrayList<>();
        if (initialProducts != null) {
            this.products.addAll(initialProducts);
        }
        recalculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        if (product == null || quantity <= 0) {
            return;
        }
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
        totalPrice += product.getPrice() * quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private void recalculateTotal() {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        totalPrice = sum;
    }

    @Override
    public double generateBill() {
        return totalPrice;
    }

    @Override
    public double applyDiscount(double couponAmount) {
        if (couponAmount <= 0) {
            return totalPrice;
        }

        double perishableTotal = 0.0;
        double nonPerishableTotal = 0.0;

        for (Product p : products) {
            if (p instanceof PerishableProduct) {
                perishableTotal += p.getPrice();
            } else if (p instanceof NonPerishableProduct) {
                nonPerishableTotal += p.getPrice();
            }
        }

        double perishableDiscountShare = couponAmount * 0.7;
        double nonPerishableDiscountShare = couponAmount * 0.3;

        double finalTotal = totalPrice;
        finalTotal -= Math.min(perishableDiscountShare, perishableTotal);
        finalTotal -= Math.min(nonPerishableDiscountShare, nonPerishableTotal);

        if (finalTotal < 0) {
            finalTotal = 0;
        }

        return finalTotal;
    }
}