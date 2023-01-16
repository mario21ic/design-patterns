package com.mario21ic;

public class TelefonoProxy extends Telefono {

    private Telefono telefono;

    public TelefonoProxy(String numero) {
        super(numero);
        this.telefono = new TelefonoNormal(numero);
    }

    @Override
    public void enviarVoz(String mensaje) {
        System.out.println("Proxy: Grabando mensaje " + mensaje);
        this.telefono.enviarVoz(mensaje);
    }
    
    
}
