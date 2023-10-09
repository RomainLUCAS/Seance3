package org.example;

import java.util.LinkedList;

public class Composite implements Component{

    private LinkedList<Component> component = new LinkedList<Component>();
    private String name;
    @Override
    public int calculPrix() {
        int somme = 0;

        for(int i = 0 ; i < component.size() ; i++)
        {
            somme += component.get(i).calculPrix();
        }
        return somme;
    }

    @Override
    public String getName() {
        for(int i = 0 ; i < component.size() ; i++)
        {
            name += component.get(i).getName();
        }
        return name;
    }

    public void addComponent(Component c)
    {
        component.add(c);
    }

    public void removeComponent(Component c)
    {
        component.remove(c);
    }

    public Composite(String n)
    {
        name = n;
    }
}
