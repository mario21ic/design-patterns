package com.mario21ic;

public class PantalonFactory {
    public static Pantalon getInstance(String tipo) {
        if (tipo == "madrid") {
            return new PantalonMadrid();
        }
        return new PantalonBarcelona();
    }
}
