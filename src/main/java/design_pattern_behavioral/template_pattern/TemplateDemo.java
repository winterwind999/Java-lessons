package design_pattern_behavioral.template_pattern;

public class TemplateDemo {
    static void main() {
        System.out.println("Web Order: ");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("Store Order: ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
