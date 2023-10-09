package org.example;

public class SimpleComponent implements Component{

    private int prix = 0;
    private String name = "";

    public SimpleComponent(int p, String n)
    {
        prix = p;
        name = n;
    }
    @Override
    public int calculPrix() {
        return prix;
    }

    @Override
    public String getName() {
        return name;
    }

}
