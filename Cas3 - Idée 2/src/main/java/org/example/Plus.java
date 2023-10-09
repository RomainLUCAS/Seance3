package org.example;

public class Plus implements Expression{
    public Expression droite;
    public Expression gauche;

    Plus(Expression d, Expression g){
        droite = d;
        gauche = g;
    }

    @Override
    public int accepter(Visiteur visiteur) {
        return visiteur.visiter(this);
    }
}
