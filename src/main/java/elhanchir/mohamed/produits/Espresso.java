package elhanchir.mohamed.produits;

public class Espresso extends Boisson{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 7.99;
    }
}
