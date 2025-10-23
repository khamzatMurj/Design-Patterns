package P_decorator.decorator;

import P_decorator.composant.Boisson;

public class caramel extends DecorateurAbstrait{

    public caramel(Boisson boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return 1.7+boison.cout();
    }

    @Override
    public String getDescription() {
        return boison.getDescription() +"au caramel";
    }
}
