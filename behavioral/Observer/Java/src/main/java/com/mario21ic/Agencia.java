package com.mario21ic;

import java.util.ArrayList;
import java.util.List;

// Es el Observador
public class Agencia {

    private List<Noticia> noticias = new ArrayList<Noticia>();
    private List<ObservadorNoticias> observadores = new ArrayList<ObservadorNoticias>();

    // private Television television = new Television();
    // private Periodico periodico = new Periodico();

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }

    public void addNoticia(Noticia noticia) {
        noticias.add(noticia);

        // Emitir la noticia a todos
        for (ObservadorNoticias o: observadores) {
            o.emitirNoticia(noticia);
        }
    }

    // public void emitirNoticiaPeriodico(Noticia noticia) {
    //     periodico.emitirNoticia(noticia);
    // }

    // public void emitirNoticiaTelevision(Noticia noticia) {
    //     television.emitirNoticia(noticia);
    // }

    public void addObservador(ObservadorNoticias observador) {
        observadores.add(observador);
    }
}
