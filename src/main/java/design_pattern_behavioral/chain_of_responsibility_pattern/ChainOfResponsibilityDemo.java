package design_pattern_behavioral.chain_of_responsibility_pattern;

public class ChainOfResponsibilityDemo {
    static void main() {
        Director bryan = new Director();
        VP mel = new VP();
        CEO crystal = new CEO();

        bryan.setSuccessor(mel);
        mel.setSuccessor(crystal);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
