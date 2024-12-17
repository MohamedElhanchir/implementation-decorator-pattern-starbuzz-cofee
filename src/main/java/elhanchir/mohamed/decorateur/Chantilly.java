package elhanchir.mohamed.decorateur;

import elhanchir.mohamed.produits.Boisson;

public class Chantilly extends DecorateurIngredient {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Au Chantilly";
    }

    @Override
    public double cout() {
        return 2.99 + boisson.cout();
    }
}
