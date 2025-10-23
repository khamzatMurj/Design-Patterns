package P_observer.technique_push.Onservers;

public class ObserverImpl2 implements Observer {

    private double previous_state;
    @Override
    public void update(int status) {

        if (status-previous_state >0)
            System.out.println("observateur 2 => pression increase");

        else if (status-previous_state <0)
            System.out.println("observateur 2 => depression...");

        else System.out.println("observateur 2 => stabiliter...");

        previous_state=status;
    }
}
