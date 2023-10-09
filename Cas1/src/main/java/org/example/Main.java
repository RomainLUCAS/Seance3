package org.example;

public class Main {
    public static void main(String[] args) {

        //Composant principal
        Composite c = new Composite("Ordinateur");

        //Composants simples
        SimpleComponent sc1 = new SimpleComponent(64, "Barrette de RAM");
        SimpleComponent sc2 = new SimpleComponent(38, "CPU");

        //On ajoute un composite (composant en contenant d'autres).
        Composite c1 = new Composite("Carte réseau");
        SimpleComponent sc3 = new SimpleComponent(72, "Barrette de RAM");
        SimpleComponent sc4 = new SimpleComponent(44, "CPU");
        c1.addComponent(sc3);
        c1.addComponent(sc4);

        //On ajoute tout ça à l'ordinateur
        c.addComponent(sc1);
        c.addComponent(sc2);
        c.addComponent(c1);

        System.out.println("Prix total des composants : " + c.calculPrix());

    }
}