package functionalInterface.markerInterfaces.cloningPrototypeObjects;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Product p1 = new Product(1, "Laptop");
        Product p2 = p1.clone();

        System.out.println(p1 == p2); 
        System.out.println(p1.name); 
        System.out.println(p2.name); 
    }
}


