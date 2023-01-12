package com.mario21ic;

import java.util.ArrayList;
import java.util.List;

// Puede tener comportamiento recursivo
public class RegaloCaja extends Regalo {

    private List<Regalo> regalos = new ArrayList<Regalo>();

    public RegaloCaja(String nombre) {
        super(nombre);
    }

    @Override
    public boolean esCajaRegalo() {
        return true;
    }

    
    public void setRegalos(List<Regalo> regalos) {
        this.regalos = regalos;
    }
    
    public void addRegalo(Regalo regalo) {
        regalos.add(regalo);
    }
    
    public List<Regalo> getRegalos() {
        return regalos;
    }
}
