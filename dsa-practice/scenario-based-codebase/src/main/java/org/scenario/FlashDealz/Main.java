package org.scenario.FlashDealz;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Shoes", 40),
            new Product("Watch", 70),
            new Product("Bag", 30),
            new Product("Phone", 60)
        };

        FlashDealz fd = new FlashDealz();
        fd.quickSort(products, 0, products.length - 1);

        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "%");
        }
    }
}

