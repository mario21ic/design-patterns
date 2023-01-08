package com.mario21ic;

public class RopaFactoryMadrid extends RopaAbstractFactory {

    @Override
    public Camiseta getCamiseta() {
        return new CamisetaMadrid();
    }

    @Override
    public Pantalon getPantalon() {
        return new PantalonMadrid();
    }
    
}
