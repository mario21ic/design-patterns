package com.mario21ic;

import java.util.ArrayList;
import java.util.List;

public class RegaloSencillo extends Regalo {

    public RegaloSencillo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean esCajaRegalo() {
        return false;
    }

    @Override
    public List<Regalo> getRegalos() {
        return new ArrayList<Regalo>();
    }
    
}
