package Bahvioural.P_Command;



public class CommandB implements Commande {

    private Receiver receiver;

    public CommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionB();
    }
}
