package org.scenario.SmartCheckout;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SmartCheckout checkout = new SmartCheckout();

        checkout.store.put("Milk", new Items(50, 10));
        checkout.store.put("Bread", new Items(30, 5));
        checkout.store.put("Eggs", new Items(10, 20));

        checkout.addCustomer(
            new Customer("Harsh", Arrays.asList("Milk", "Bread"))
        );
        checkout.addCustomer(
            new Customer("Muskan", Arrays.asList("Eggs", "Milk"))
        );

        checkout.billCustomer();
        checkout.billCustomer();
    }
}
