package P_observer.technique_pop.Onservers;

import P_observer.technique_pop.observable.Observable;
import P_observer.technique_pop.observable.ObservableImpl;



public class ObserverImpl1 implements Observer {
    private double somme = 0; //accumulateur
    @Override
    public void update(ObservableImpl obs) {
        somme+=((ObservableImpl)obs).getEtat();
        System.out.println("observateur 1 Somme = "+somme);
    }
}
