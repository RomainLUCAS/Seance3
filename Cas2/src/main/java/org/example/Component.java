package org.example;

public interface Component {
    double getPrice();
    boolean validateConfiguration();

    // Cette méthode va permettre à chaque Component
    // d'effectuer des opérations non connues à l'avance.
    // C'est le fait que Visitor soit une interface qui va permettre
    // d'ajouter autant de nouveux comportements que l'on souhaite,
    // en crééant de nouveaux visiteurs implémentant cette interface.
    Object accept(Visitor visitor);
}
