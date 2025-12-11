package design_pattern_creational.factory_method_pattern;

public class FactoryDemo {
    static void main() {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(website.getPages());
    }
}
