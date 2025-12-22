package design_pattern_behavioral.chain_of_responsibility_pattern;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve Conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
