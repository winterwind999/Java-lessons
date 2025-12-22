package design_pattern_behavioral.observer_pattern;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
