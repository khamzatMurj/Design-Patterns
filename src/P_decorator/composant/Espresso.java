package P_decorator.composant;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Espreso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
