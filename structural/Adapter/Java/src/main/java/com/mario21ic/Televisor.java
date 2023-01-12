package com.mario21ic;

public class Televisor implements Conectable {

    @Override
    public void on() {
        System.out.println("TV encendida");
        
    }

    @Override
    public void off() {
        System.out.println("TV apagada");
    }
    
}
