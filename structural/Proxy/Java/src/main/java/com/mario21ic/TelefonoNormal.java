package com.mario21ic;

public class TelefonoNormal extends Telefono {

    public TelefonoNormal(String numero) {
        super(numero);
    }

    @Override
    public void enviarVoz(String mensaje) {
        System.out.println("Normal: enviar voz a " + this.getNumero() + " - " + mensaje);
    }
    
}
