package com.mario21ic;

public class TelefonoSmart extends Telefono {

    public TelefonoSmart(String numero) {
        super(numero);
    }

    @Override
    public void enviarVoz(String mensaje) {
        System.out.println("Smart: enviar voz a " + this.getNumero() + " - " + mensaje);
    }
    
    public void enviarVideo() {
        System.out.println("Smart: enviar video a " + this.getNumero());
    }
}
