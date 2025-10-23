package Bahvioural.P_Command;

public class App {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Commande cmdA = new CommandA(receiver);
        Commande cmdB = new CommandB(receiver);

        Invoquer inv = new Invoquer();
        inv.addCommande("cmdA", cmdA);
        inv.addCommande("cmdB", cmdB);
        inv.executeCommande("cmdA");
        inv.executeCommande("cmdB");
        inv.executeCommande("cmdC");
    }
}
