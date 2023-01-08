package com.mario21ic;

public class CursoBasicoBuilder {

    private Curso curso;
    

    public CursoBasicoBuilder() {
        super();
        curso = new Curso();
    }

    public void addNombre(String nombre) {
        curso.setNombre(nombre);
    }

    public void addVideo(String url) {
        // Validamos que tenga nombre
        if (curso.getNombre() == null) {
            throw new RuntimeException("curso sin nombre");
        }
        // Limitamos a 3 la cantidad de videos
        if (curso.getVideos().size()<3) {
            curso.addVideo(new Video(url));
        }
    }

    public void addEjercicios(String ejercicio) {
        // Builder se encarga de gestionar de forma sencilla el proceso de construccion
        curso.addEjercicio(new Ejercicio(ejercicio));
    }

    public void addTest(String ...preguntas) {
        // Agregamos 2 preguntas
        Test test1 = new Test();
        test1.setPregunta1(preguntas[0]);
        test1.setPregunta1(preguntas[1]);

        curso.setTest(test1);
    }

    // Builder
    public Curso build() {
        return curso;
    }
}
