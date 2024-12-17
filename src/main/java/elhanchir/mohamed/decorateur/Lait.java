package elhanchir.mohamed.decorateur;

import elhanchir.mohamed.produits.Boisson;

public class Lait extends DecorateurIngredient {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au Lait";
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }
}
