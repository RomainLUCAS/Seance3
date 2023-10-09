package org.example;

public class Moins implements Expression{
    public Expression droite;
    public Expression gauche;

    public Moins(Expression g, Expression d){
        droite = d;
        gauche = g;
    }

    @Override
    public int accepter(Visiteur visiteur) {
        return visiteur.visiter(this);
    }
}
