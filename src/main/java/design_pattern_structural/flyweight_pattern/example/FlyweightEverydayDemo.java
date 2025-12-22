package design_pattern_structural.flyweight_pattern.example;

public class FlyweightEverydayDemo {
    static void main() {
        Integer firstInt = Integer.valueOf("5");

        Integer secondInt = Integer.valueOf("5");

        Integer thirdInt = Integer.valueOf("10");

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }
}
