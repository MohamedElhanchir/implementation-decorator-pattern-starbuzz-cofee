package elhanchir.mohamed.decorateur;

import elhanchir.mohamed.produits.Boisson;

public class Caramel extends DecorateurIngredient {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au Caramel";
    }

    @Override
    public double cout() {
        return 3.5 + boisson.cout();
    }
}
