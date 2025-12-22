package design_pattern_behavioral.visitor_pattern;

class Wheel implements AtvPart {
    @Override
    public void accept(AtvPartVisitor atvPartVisitor) {
        atvPartVisitor.visit(this);
    }
}
