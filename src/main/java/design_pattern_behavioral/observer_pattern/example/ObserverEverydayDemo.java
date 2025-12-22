package design_pattern_behavioral.observer_pattern.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
    static void main() {
        TwitterStream twitterStream = new TwitterStream();

        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");
        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);
        twitterStream.someoneTweeted();
    }
}

// concrete object
class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

// concrete observer
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update" + name + "'s stream, someone tweeted something");
    }
}