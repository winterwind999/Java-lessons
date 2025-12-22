package design_pattern_behavioral.visitor_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PartsOrder implements AtvPart {
    List<AtvPart> atvParts = new ArrayList<>();

    public void addPart(AtvPart atvPart) {
        atvParts.add(atvPart);
    }

    public List<AtvPart> getAtvParts() {
        return Collections.unmodifiableList(atvParts);
    }

    @Override
    public void accept(AtvPartVisitor atvPartVisitor) {
        for (AtvPart atvPart : atvParts) {
            atvPart.accept(atvPartVisitor);
        }
        atvPartVisitor.visit(this);
    }
}
