package com.mario21ic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing Video length
     */
    @Test
    public void OnlyThreeVideos()
    {
        CursoBasicoBuilder builder = new CursoBasicoBuilder();
        builder.addNombre("patterns");
        // builder.addEjercicios("sumar todos los items de un array");
        // builder.addEjercicios("crear una funcion que lea de un archivo");
        builder.addVideo("video1java.mp4");
        builder.addVideo("video2java.mp4");
        builder.addVideo("video3java.mp4");
        builder.addVideo("video4java.mp4"); // esto no sera tomado
        // builder.addTest("java es oo", "java es multiplataforma");
        Curso c = builder.build();

        assertTrue( c.getVideos().size()==3);
    }
}
