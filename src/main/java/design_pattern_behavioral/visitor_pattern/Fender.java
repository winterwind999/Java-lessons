package design_pattern_behavioral.visitor_pattern;

class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor atvPartVisitor) {
        atvPartVisitor.visit(this);
    }
}
