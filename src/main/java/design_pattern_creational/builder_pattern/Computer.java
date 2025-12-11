package design_pattern_creational.builder_pattern;

public class Computer {
    // What we usually do

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public Computer() {}

    public HDD getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public void setRamSize(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc =hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }
}
