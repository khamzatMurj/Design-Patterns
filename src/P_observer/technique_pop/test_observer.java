package P_observer.technique_pop;
import java.util.*;
import P_observer.technique_pop.Onservers.Observer;
import P_observer.technique_pop.Onservers.ObserverImpl1;
import P_observer.technique_pop.Onservers.ObserverImpl2;
import P_observer.technique_pop.observable.ObservableImpl;
//import javafx.event.EventHandler;
//import javafx.event.Event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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


        System.out.println("#################################################");

        obeservable.setEtat(800);

        obeservable.subscribe(new Observer() {
            @Override
            public void update(ObservableImpl obs) {
                int etat=((ObservableImpl)obs).getEtat();
                System.out.println("Obs anonyme 1 => "+etat);
            }
        });

        obeservable.subscribe((obs)->{
            int etat=((ObservableImpl)obs).getEtat();
            System.out.println("Obs anonyme 2 => "+etat);

        });
        obeservable.setEtat(800);

 ///    java fx regarder button observable pour gerer les evenements

        Button button=new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("********************sad******************");
            }
        });

        java.awt.Button button1=new Button();
        button1.addActionListener((e)->{
            System.out.println("lkkkkkkkkkkkkkkklllllllkkkkkkkklll ");
        } );



    }
}
