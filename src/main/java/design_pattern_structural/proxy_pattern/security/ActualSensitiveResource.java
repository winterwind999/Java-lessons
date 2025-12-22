package design_pattern_structural.proxy_pattern.security;

public class ActualSensitiveResource implements SensitiveResource {
    @Override
    public void accessResource() {
        System.out.println("Accessing sensitive data");
    }
}
