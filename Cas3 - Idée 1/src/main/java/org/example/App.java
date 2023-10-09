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
        //2 + (3-1)
        Expression expression = new Plus(
                new Nombre(2),
                new Moins(
                        new Nombre(3),
                        new Nombre(1)
                )
        );
        System.out.println("Résultat : "+ expression.Resultat());
    }
}
