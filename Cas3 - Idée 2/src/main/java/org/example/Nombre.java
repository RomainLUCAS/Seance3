package org.example;

public class Nombre implements Expression{
    public int valeur;

    public Nombre(int val)
    {
        valeur = val;
    }

    @Override
    public int accepter(Visiteur visiteur) {
        return visiteur.visiter(this);
    }
}
