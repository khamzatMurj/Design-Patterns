package P_decorator.decorator;

import P_decorator.composant.Boisson;

public class chocolat extends DecorateurAbstrait{

    public chocolat(Boisson boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return 1.5+boison.cout();
    }

    @Override
    public String getDescription() {
        return boison.getDescription() +" au chocolat";
    }
}
