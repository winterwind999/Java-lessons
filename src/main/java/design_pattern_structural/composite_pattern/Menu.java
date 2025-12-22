package design_pattern_structural.composite_pattern;

import java.util.Iterator;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name)
                .append(": ")
                .append(url)
                .append("\n");

        for (MenuComponent menuComponent : menuComponents) {
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }
}
