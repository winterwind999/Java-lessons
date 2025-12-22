package design_pattern_structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implement at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implement at this level");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print() {
        return name + ": " + url + "\n";
    }
}
