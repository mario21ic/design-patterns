package com.mario21ic;

public class CamisetaFactory {
    public static Camiseta getInstance(String tipo) {
        if (tipo == "madrid") {
            return new CamisetaMadrid();
        }
        return new CamisetaBarcelona();
    }
}
