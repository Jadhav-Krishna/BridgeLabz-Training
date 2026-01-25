package generics.smartWarehouseManagementSystem;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> eStore = new Storage<>();
        Storage<Groceries> gStore = new Storage<>();
        Storage<Furniture> fStore = new Storage<>();

        eStore.addItem(new Electronics("Laptop"));
        eStore.addItem(new Electronics("Mobile"));

        gStore.addItem(new Groceries("Rice"));
        gStore.addItem(new Groceries("Sugar"));

        fStore.addItem(new Furniture("Chair"));
        fStore.addItem(new Furniture("Table"));

        System.out.println("---- Electronics ----");
        WareHouseUtil.displayItems(eStore.getItems());

        System.out.println("---- Groceries ----");
        WareHouseUtil.displayItems(gStore.getItems());

        System.out.println("---- Furniture ----");
        WareHouseUtil.displayItems(fStore.getItems());
    }
}

