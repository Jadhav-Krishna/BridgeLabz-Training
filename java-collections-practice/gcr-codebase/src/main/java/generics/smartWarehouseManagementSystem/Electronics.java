package generics.smartWarehouseManagementSystem;

class Electronics extends WareHouseItem {
    public Electronics(String name) {
        super(name);
    }

    public String getCategory() {
        return "Electronics";
    }
}
