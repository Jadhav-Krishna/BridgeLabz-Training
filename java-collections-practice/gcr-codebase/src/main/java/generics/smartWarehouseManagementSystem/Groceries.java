package generics.smartWarehouseManagementSystem;

class Groceries extends WareHouseItem {
    public Groceries(String name) {
        super(name);
    }

    public String getCategory() {
        return "Groceries";
    }
}
