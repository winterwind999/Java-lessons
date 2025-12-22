package design_pattern_structural.proxy_pattern.example;

public class CustomServiceImpl implements CustomService {
    @Override
    public void doServiceCall() {
        System.out.println("Actual service doing the work");
    }
}
