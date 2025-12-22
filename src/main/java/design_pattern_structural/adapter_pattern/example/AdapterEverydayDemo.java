package design_pattern_structural.adapter_pattern.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {
    static void main() {
        int[] normalArrayInt = new int[] {69,70,71};

        Integer[] arrayOfInts = new Integer[] {42,43,44};

        List<Integer> listofInts = Arrays.asList(arrayOfInts);

        List<Integer> listofInts2 = Arrays.stream(normalArrayInt).boxed().toList();

        System.out.println("normalArrayInt: " + normalArrayInt);

        System.out.println("arrayOfInts: " + arrayOfInts);

        // cant change size
        System.out.println("listofInts: " + listofInts);

        // immutable
        System.out.println("listofInts2: " + listofInts2);

        // modifiable list
        List<Integer> modifiable =
                new ArrayList<>(Arrays.stream(normalArrayInt).boxed().toList());
    }
}
