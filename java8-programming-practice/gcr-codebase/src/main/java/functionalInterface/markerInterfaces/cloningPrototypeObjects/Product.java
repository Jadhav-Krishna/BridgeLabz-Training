package functionalInterface.markerInterfaces.cloningPrototypeObjects;

class Product implements Cloneable {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}

