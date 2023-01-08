package com.mario21ic;

public abstract class Camiseta {
    private int numero;
    private String jugador;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public abstract void imprimir();
}
