package design_pattern_behavioral.visitor_pattern;

import java.util.List;

class AtvPartsShippingVisitor implements AtvPartVisitor {
    double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fender is bulky");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil has a hazmat fee");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 12;
        System.out.println("Wheels are bulky and hazmat fee");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 times we will give a discount on shipping");
        List<AtvPart> atvParts = partsOrder.getAtvParts();
        if (atvParts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
