package generics.dynamicOnlineMarketplaceSystem;

public class Main {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> cloth = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smart Watch", 3000, new GadgetCategory());

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(cloth);
        catalog.addProduct(gadget);

        System.out.println("Catalog Before Discount");
        catalog.showCatalog();

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(gadget, 20);

        System.out.println("Catalog After Discount");
        catalog.showCatalog();
    }
}
