package com.mario21ic;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private List<Video> videos = new ArrayList<Video>();
    private List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
    private Test test = new Test();

    // Constructor vacio
    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void addEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
    
}
