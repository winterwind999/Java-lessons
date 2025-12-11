package design_pattern_creational.factory_method_pattern;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case WebsiteType.BLOG: {
                return new Blog();
            }
            case WebsiteType.SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
