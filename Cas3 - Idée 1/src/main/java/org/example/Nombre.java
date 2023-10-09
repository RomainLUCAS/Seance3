package org.example;

public class Nombre implements Expression{
    public int valeur;

    public Nombre(int val)
    {
        valeur = val;
    }
    @Override
    public int Resultat() {
        return valeur;
    }
}
