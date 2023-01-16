package com.mario21ic;

public class Periodico implements ObservadorNoticias {

    public void emitirNoticia(Noticia noticia) {
        System.out.println("Periodico emite noticia: " + noticia.getTexto());
    }
    
}
