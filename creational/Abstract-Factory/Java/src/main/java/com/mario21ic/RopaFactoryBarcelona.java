package com.mario21ic;

public class RopaFactoryBarcelona extends RopaAbstractFactory {

    @Override
    public Camiseta getCamiseta() {
        return new CamisetaBarcelona();
    }

    @Override
    public Pantalon getPantalon() {
        return new PantalonBarcelona();
    }
    
}
