package design_pattern_behavioral.chain_of_responsibility_pattern;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
