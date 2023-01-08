package com.mario21ic;

public abstract class RopaAbstractFactory {
    public abstract Camiseta getCamiseta();
    public abstract Pantalon getPantalon();

    public static RopaAbstractFactory getInstance(String tipo) {
        if (tipo == "madrid") {
            return new RopaFactoryMadrid();
        }
        return new RopaFactoryBarcelona();
    }
}
