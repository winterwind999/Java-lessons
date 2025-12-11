package design_pattern_creational.factory_method_pattern;

import design_pattern_creational.factory_method_pattern.factory_demo_pages.CartPage;
import design_pattern_creational.factory_method_pattern.factory_demo_pages.ItemPage;
import design_pattern_creational.factory_method_pattern.factory_demo_pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
