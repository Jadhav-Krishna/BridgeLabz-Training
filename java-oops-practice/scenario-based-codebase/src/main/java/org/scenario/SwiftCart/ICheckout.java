package org.scenario.SwiftCart;

import java.util.*;

public interface ICheckout {
    double generateBill();
    double applyDiscount(double couponAmount);
}