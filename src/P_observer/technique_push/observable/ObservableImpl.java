package P_observer.technique_push.observable;

import P_observer.technique_push.Onservers.Observer;

import java.util.*;

public class ObservableImpl implements Observable {

    //gerer un etat

    private int etat;
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void subscribe(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unsubscribe(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            //push
            o.update(etat);
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }
}
