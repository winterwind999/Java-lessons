package design_pattern_creational.builder_pattern;

public class PC {
    public static class PCBuilder {
        // Alternative, which is the builder pattern

        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbc;
        private boolean hasGigabitWifi;

        public PCBuilder() {

        }

        public PC build() {
            return new PC(this);
        }

        public PCBuilder addRam(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public PCBuilder addHdd(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public PCBuilder hasUsbc(boolean hasUsbc) {
            this.hasUsbc = hasUsbc;
            return this;
        }

        public PCBuilder hasGigabitWifi(boolean hasGigabitWifi) {
            this.hasGigabitWifi = hasGigabitWifi;
            return this;
        }
    }

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public PC(PCBuilder pcBuilder) {
        this.diskSize = pcBuilder.diskSize;
        this.ramSize = pcBuilder.ramSize;
        this.hasUsbc = pcBuilder.hasUsbc;
        this.hasGigabitWifi = pcBuilder.hasGigabitWifi;
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
