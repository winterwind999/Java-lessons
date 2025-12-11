package design_pattern_creational.factory_method_pattern.example;

import java.util.Calendar;

public class FactoryEverydayDemo {
    static void main() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
