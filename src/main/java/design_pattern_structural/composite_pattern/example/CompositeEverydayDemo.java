package design_pattern_structural.composite_pattern.example;

import java.util.HashMap;
import java.util.Map;

public class CompositeEverydayDemo {
    static void main() {
        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role","person");
        personAttributes.put("access_role","limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role","limited");

        Map<String, String> secAttributes = new HashMap<>();

        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);
    }
}
