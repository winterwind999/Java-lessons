package design_pattern_behavioral.iterator_pattern;

import java.util.Iterator;

public class IteratorDemo {
    static void main() {
        BikeRepository bikeRepository = new BikeRepository();
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        Iterator<String> bikes = bikeRepository.iterator();

        while (bikes.hasNext()) {
            String bike = bikes.next();
            System.out.println(bike);
        }
    }
}
