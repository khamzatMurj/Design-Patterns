package P_decorator.decorator;

import P_decorator.composant.Boisson;

public class vanille extends DecorateurAbstrait{

    public vanille(Boisson boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return 0.9+boison.cout();
    }

    @Override
    public String getDescription() {
        return boison.getDescription() +"avec Vanille";
    }
}
