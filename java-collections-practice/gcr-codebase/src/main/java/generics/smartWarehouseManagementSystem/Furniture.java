package generics.smartWarehouseManagementSystem;

class Furniture extends WareHouseItem {
    public Furniture(String name) {
        super(name);
    }

    public String getCategory() {
        return "Furniture";
    }
}