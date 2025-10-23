package P_observer.technique_push.Onservers;

public class ObserverImpl1 implements Observer {
    private double somme = 0; //accumulateur
    @Override
    public void update(int status) {
        somme+=status;
        System.out.println("observateur 1 Somme = "+somme);
    }
}
