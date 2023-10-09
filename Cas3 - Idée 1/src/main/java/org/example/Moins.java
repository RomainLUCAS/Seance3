package org.example;

public class Moins implements Expression{
    public Expression droite;
    public Expression gauche;

    public Moins(Expression g, Expression d){
        droite = d;
        gauche = g;
    }

    @Override
    public int Resultat() {
        return gauche.Resultat() - droite.Resultat();
    }
}
