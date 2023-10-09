package org.example;

public class Plus implements Expression{
    public Expression droite;
    public Expression gauche;

    Plus(Expression d, Expression g){
        droite = d;
        gauche = g;
    }

    @Override
    public int Resultat() {
        return gauche.Resultat() + droite.Resultat();
    }
}
