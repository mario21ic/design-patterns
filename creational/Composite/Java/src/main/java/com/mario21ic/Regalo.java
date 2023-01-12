package com.mario21ic;

import java.util.List;

public abstract class Regalo {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Regalo(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean esCajaRegalo();

    public abstract List<Regalo> getRegalos();
}
