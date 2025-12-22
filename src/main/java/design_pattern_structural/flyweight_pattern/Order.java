package design_pattern_structural.flyweight_pattern;

public class Order {
    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for oder number " + orderNumber);
    }
}
