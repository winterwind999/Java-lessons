package design_pattern_structural.flyweight_pattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "`\nTotal item objects made: " + catalog.totalItemsMade();
    }
}
