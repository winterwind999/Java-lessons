package design_pattern_creational.builder_pattern;

public class ComputerTelescoping {
    // Alternative but rigid

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public ComputerTelescoping(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize) {
        this(ramSize);
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasGigabitWifi) {
        this(diskSize, ramSize);
        this.hasGigabitWifi = hasGigabitWifi;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasGigabitWifi, boolean hasUsbc) {
        this(diskSize, ramSize, hasGigabitWifi);
        this.hasUsbc = hasUsbc;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }
}
