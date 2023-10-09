package org.example;

public class OperationVisiteur implements Visiteur {
    @Override
    public int visiter(Plus plus) {
        return plus.gauche.accepter(this) + plus.droite.accepter(this);
    }

    @Override
    public int visiter(Moins moins) {
        return moins.gauche.accepter(this) - moins.droite.accepter(this);
    }

    @Override
    public int visiter(Nombre nombre) {
        return nombre.valeur;
    }
}
