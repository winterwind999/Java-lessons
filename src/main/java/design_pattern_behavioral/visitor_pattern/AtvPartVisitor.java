package design_pattern_behavioral.visitor_pattern;

public interface AtvPartVisitor {
    void visit(Fender fender);

    void visit(Oil oil);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
