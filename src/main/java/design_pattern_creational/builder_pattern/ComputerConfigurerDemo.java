package design_pattern_creational.builder_pattern;

public class ComputerConfigurerDemo {
    static void main() {
        Computer computer = new Computer();
        computer.setDiskSize(HDD.DEFAULT);
        computer.setRamSize(RAM.DEFAULT);
        computer.setHasUsbc(true);
        computer.setHasGigabitWifi(true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
