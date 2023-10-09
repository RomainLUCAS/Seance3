package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Exemple d'expression : 5 + (3 - 2)
        Expression expression = new Plus(new Nombre(5), new Moins(new Nombre(3), new Nombre(2)));

        Visiteur evaluateVisitor = new OperationVisiteur();

        int resultat = expression.accepter(evaluateVisitor);

        System.out.println("Résultat : " + resultat);
    }
}
