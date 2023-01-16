package com.mario21ic;

public abstract class Telefono {

    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public abstract void enviarVoz(String mensaje);
}
