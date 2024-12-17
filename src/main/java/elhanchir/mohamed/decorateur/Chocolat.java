package elhanchir.mohamed.decorateur;

import elhanchir.mohamed.produits.Boisson;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au Chocolat";
    }

    @Override
    public double cout() {
        return 4 + boisson.cout();
    }
}
