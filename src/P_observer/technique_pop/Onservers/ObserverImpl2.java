package P_observer.technique_pop.Onservers;

import P_observer.technique_pop.observable.Observable;
import P_observer.technique_pop.observable.ObservableImpl;

public class ObserverImpl2 implements Observer {

    private double previous_state;
    @Override
    public void update(ObservableImpl obs) {
        int status = ((ObservableImpl)obs).getEtat();
        if (status-previous_state >0)
            System.out.println("observateur 2 => pression increase");

        else if (status-previous_state <0)
            System.out.println("observateur 2 => depression...");

        else System.out.println("observateur 2 => stabiliter...");

        previous_state=((ObservableImpl)obs).getEtat();
    }

}
