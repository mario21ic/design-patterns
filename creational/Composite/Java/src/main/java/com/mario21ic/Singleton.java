package com.mario21ic;

public class Singleton {
    
    private String carpeta;
    // declarar variable estatica
    private static Singleton configurador;

    // Declarando privado para que no se acceda desde afuera
    private Singleton(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    // No hace falta crear objetos para invocarlo
    public static Singleton getInstance(String carpeta) {
        if (configurador==null) {
            configurador = new Singleton(carpeta);
        }
        return configurador;
    }
}
