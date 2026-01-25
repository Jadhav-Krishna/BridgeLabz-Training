package generics.smartWarehouseManagementSystem;

import java.util.*;

class WareHouseUtil {

    public static void displayItems(List<? extends WareHouseItem> list) {
        for (WareHouseItem item : list) {
            System.out.println(item.getName() + " - " + item.getCategory());
        }
    }
}
