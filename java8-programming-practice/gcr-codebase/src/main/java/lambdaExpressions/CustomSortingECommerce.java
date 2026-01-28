package lambdaExpressions;
import java.util.*;
public class CustomSortingECommerce {
    static class Product {
        String name;
        double price;
        double rating;
        int discountPercentage;

        Product(String name, double price, double rating, int discountPercentage) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discountPercentage = discountPercentage;
        }

        @Override
        public String toString() {
            return "Product{" + "name='" + name + '\'' +", price=" + price + ", rating=" + rating + ", discountPercentage=" + discountPercentage + '}';
        }
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop", 1200.00, 4.5, 10),
                new Product("Smartphone", 800.00, 4.7, 15),
                new Product("Headphones", 150.00, 4.2, 20),
                new Product("Monitor", 300.00, 4.6, 5)
        };

        // Sort by price
        System.out.println("Sorting by Price:");
        Arrays.sort(products, (p1, p2) -> Double.compare(p1.price, p2.price));
        printProducts(products);

        // Sort by rating
        System.out.println("\nSorting by Rating:");
        Arrays.sort(products, (p1, p2) -> Double.compare(p2.rating, p1.rating));
        printProducts(products);

        // Sort by discount
        System.out.println("\nSorting by Discount:");
        Arrays.sort(products, (p1, p2) -> Integer.compare(p2.discountPercentage, p1.discountPercentage));
        printProducts(products);
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
