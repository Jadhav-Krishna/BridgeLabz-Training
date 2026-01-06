import java.util.*;

public interface ICheckout {
    double generateBill();
    double applyDiscount(double couponAmount);
}