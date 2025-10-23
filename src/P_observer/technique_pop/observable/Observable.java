package P_observer.technique_pop.observable;

import P_observer.technique_pop.Onservers.Observer;

public interface Observable {
    void subscribe(Observer obs);
    void unsubscribe(Observer obs);
    void notifyObservers();
}
