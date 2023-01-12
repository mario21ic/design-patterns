package com.mario21ic;

public class Lampara implements Conectable {

    @Override
    public void on() {
        System.out.println("Lampara encendida");
    }

    @Override
    public void off() {
        System.out.println("Lampara apagada");
    }
    
}
