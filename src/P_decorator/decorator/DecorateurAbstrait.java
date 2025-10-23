package P_decorator.decorator;

import P_decorator.composant.Boisson;

public abstract class DecorateurAbstrait extends Boisson {
    protected Boisson boison; //agregation un decorator permet de decorer une boisson

    protected DecorateurAbstrait(Boisson boison){
        this.boison=boison;
    }
    public abstract String getDescription();

}
