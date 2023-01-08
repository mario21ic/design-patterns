package com.mario21ic;

public abstract class Pantalon {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract void imprimir();
}
