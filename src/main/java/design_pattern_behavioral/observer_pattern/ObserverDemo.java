package design_pattern_behavioral.observer_pattern;

public class ObserverDemo {
    static void main() {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message");
        tabletClient.addMessage("Another new message");
    }
}
