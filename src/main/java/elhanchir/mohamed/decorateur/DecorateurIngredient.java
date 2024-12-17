package elhanchir.mohamed.decorateur;

import elhanchir.mohamed.produits.Boisson;

public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;

    public DecorateurIngredient(Boisson boisson) {
        this.boisson = boisson;
    }
}
