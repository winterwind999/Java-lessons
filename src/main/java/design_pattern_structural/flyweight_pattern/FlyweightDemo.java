package design_pattern_structural.flyweight_pattern;

public class FlyweightDemo {
    static void main() {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Roomba", 563);
        inventorySystem.takeOrder("Bose Headphones", 321);
        inventorySystem.takeOrder("Roomba", 234);
        inventorySystem.takeOrder("Samsung TV",  54);
        inventorySystem.takeOrder("Roomba",  34);
        inventorySystem.takeOrder("Bose Headphones", 365);
        inventorySystem.takeOrder("Samsung TV", 332);
        inventorySystem.takeOrder("Roomba", 456);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
