package Bahvioural.P_Command;

public class CommandA implements Commande {

    private Receiver receiver;

    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("CommandA");
    }
}
