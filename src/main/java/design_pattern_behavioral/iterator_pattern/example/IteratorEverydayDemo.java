package design_pattern_behavioral.iterator_pattern.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {
    static void main() {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesItr = names.iterator();

        System.out.println(names);

        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        System.out.println(names);
    }
}
