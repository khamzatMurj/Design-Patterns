package P_observer.technique_push.observable;

import P_observer.technique_push.Onservers.Observer;

public interface Observable {
    void subscribe(Observer obs);
    void unsubscribe(Observer obs);
    void notifyObservers();
}
