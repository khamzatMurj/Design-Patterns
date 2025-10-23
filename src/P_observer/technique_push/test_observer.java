package P_observer.technique_push;

import P_observer.technique_push.Onservers.Observer;
import P_observer.technique_push.Onservers.ObserverImpl1;
import P_observer.technique_push.Onservers.ObserverImpl2;
import P_observer.technique_push.observable.ObservableImpl;


public class test_observer {
    public static void main(String[] args) {
        ObservableImpl obeservable=new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2();
        obeservable.subscribe(obs1);
        obeservable.subscribe(obs2);

        obeservable.setEtat(90);
        System.out.println("------------------------------");
        obeservable.setEtat(60);

        System.out.println("******************************");

        obeservable.unsubscribe(obs2);
        obeservable.setEtat(0);



    }

}


