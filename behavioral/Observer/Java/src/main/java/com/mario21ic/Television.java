package com.mario21ic;

public class Television implements ObservadorNoticias {

    private String nombre;
    
    public Television() {
    }

    public Television(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void emitirNoticia(Noticia noticia) {
        System.out.println("TV " + this.getNombre() +" emite noticia: " + noticia.getTexto());
    }
}
