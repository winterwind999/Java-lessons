package design_pattern_behavioral.visitor_pattern;

class Oil implements AtvPart {
    @Override
    public void accept(AtvPartVisitor atvPartVisitor) {
        atvPartVisitor.visit(this);
    }
}
