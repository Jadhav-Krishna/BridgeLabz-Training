package generics.dynamicOnlineMarketplaceSystem;

class DiscountService {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double oldPrice = product.getPrice();
        double newPrice = oldPrice - (oldPrice * percentage / 100);
        product.setPrice(newPrice);

        System.out.println("Discount Applied on " + product.getName() +" New Price: " + newPrice);
    }
}
