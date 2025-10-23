package Bahvioural.P_Command;

import java.util.HashMap;

public class Invoquer {
    private HashMap<String, Commande> commandes = new HashMap<>();

    public void addCommande(String name, Commande commande)
    {
        commandes.put(name, commande);
    }

    public void executeCommande(String name)
    {
        Commande cmd = commandes.get(name);
        if (cmd != null) {
            cmd.execute();

        } else {
            throw new RuntimeException("Command not found go to help !!");
        }
        ;
    }


}
