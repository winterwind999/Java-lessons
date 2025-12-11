package design_pattern_creational.builder_pattern;

public class PCConfigurerDemo {
    static void main() {
        PC.PCBuilder pcBuilder = new PC.PCBuilder();
        pcBuilder.addHdd(HDD.MAX).addRam(RAM.UPGRADED).hasUsbc(true).hasGigabitWifi(true);
        PC pc = new PC(pcBuilder);

        System.out.println(pc.getDiskSize());
        System.out.println(pc.getRamSize());
        System.out.println(pc.hasUsbc());
        System.out.println(pc.hasGigabitWifi());
    }
}
