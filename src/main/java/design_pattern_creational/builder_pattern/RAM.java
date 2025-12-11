package design_pattern_creational.builder_pattern;

public enum RAM {
    DEFAULT (512),
    UPGRADED(1024),
    MAX(2048);

    private int size;

    RAM (int size) {
        this.size = size;
    }
}
