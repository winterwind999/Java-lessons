package design_pattern_creational.factory_method_pattern;

import design_pattern_creational.factory_method_pattern.factory_demo_pages.AboutPage;
import design_pattern_creational.factory_method_pattern.factory_demo_pages.CommentPage;
import design_pattern_creational.factory_method_pattern.factory_demo_pages.ContactPage;
import design_pattern_creational.factory_method_pattern.factory_demo_pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
