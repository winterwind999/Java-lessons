package design_pattern_behavioral.template_pattern;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Website Checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
