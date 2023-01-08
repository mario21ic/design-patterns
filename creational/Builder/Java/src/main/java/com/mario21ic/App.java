package com.mario21ic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting.." );
        
        CursoBasicoBuilder builder = new CursoBasicoBuilder();
        builder.addNombre("patterns");

        builder.addEjercicios("sumar todos los items de un array");
        builder.addEjercicios("crear una funcion que lea de un archivo");
        
        builder.addVideo("video1java.mp4");
        builder.addVideo("video2java.mp4");
        builder.addVideo("video3java.mp4");
        builder.addVideo("video4java.mp4");

        builder.addTest("java es oo", "java es multiplataforma");

        Curso c = builder.build();

        for (Video v: c.getVideos()) {
            System.out.println(v.getUrl());
        }
        
    }
}
