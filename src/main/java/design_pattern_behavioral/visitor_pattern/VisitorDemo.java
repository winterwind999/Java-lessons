package design_pattern_behavioral.visitor_pattern;

public class VisitorDemo {
    static void main() {
        PartsOrder partsOrder = new PartsOrder();

        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Fender());
        partsOrder.addPart(new Oil());

        partsOrder.accept(new AtvPartsShippingVisitor());
        partsOrder.accept(new AtvPartsDisplayVisitor());
    }
}

