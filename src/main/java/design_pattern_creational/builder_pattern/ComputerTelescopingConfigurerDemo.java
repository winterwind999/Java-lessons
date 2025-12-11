package design_pattern_creational.builder_pattern;

public class ComputerTelescopingConfigurerDemo {
    static void main() {
        ComputerTelescoping computerTelescoping = new ComputerTelescoping(HDD.DEFAULT);

        System.out.println(computerTelescoping.getDiskSize());
        System.out.println(computerTelescoping.getRamSize());
        System.out.println(computerTelescoping.hasUsbc());
        System.out.println(computerTelescoping.hasGigabitWifi());
    }
}
