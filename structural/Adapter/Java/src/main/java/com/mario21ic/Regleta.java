package com.mario21ic;

import java.util.ArrayList;
import java.util.List;

public class Regleta {
    List<Conectable> elementos = new ArrayList<Conectable>();

    public List<Conectable> getElementos() {
        return elementos;
    }

    public void setElementos(List<Conectable> elementos) {
        this.elementos = elementos;
    }

    public void addConectable(Conectable elemento) {
        this.elementos.add(elemento);
    }

    public void encender() {
        for (Conectable c: this.elementos) {
            c.on();
        }
    }
}
