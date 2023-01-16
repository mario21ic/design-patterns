package com.mario21ic;

public class TelefonoFactory {

    public static Telefono getInstance(String numero, String tipo) {
        if (tipo == "normal") {
            // return new TelefonoNormal(numero);
            return new TelefonoProxy(numero);
        }
        return new TelefonoSmart(numero);
    }

}
