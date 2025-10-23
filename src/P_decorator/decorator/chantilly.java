package P_decorator.decorator;

import P_decorator.composant.Boisson;

public class chantilly extends DecorateurAbstrait{

    public chantilly(Boisson boison) {
        super(boison);
    }

    @Override
    public double cout() {
        return 0.7+boison.cout();
    }

    @Override
    public String getDescription() {
        return boison.getDescription() +"avec chantilly";
    }
}
