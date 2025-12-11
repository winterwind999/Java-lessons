package design_pattern_creational.prototype_pattern.example;

public class Record implements Cloneable {
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
