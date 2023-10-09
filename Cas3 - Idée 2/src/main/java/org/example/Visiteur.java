package org.example;

public interface Visiteur {
    int visiter(Moins moins);
    int visiter(Plus plus);
    int visiter(Nombre nombre);
}
