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
        
        Agencia ag = new Agencia();
        Television t1 = new Television("Latina");
        Television t2 = new Television("Panamericana");
        Periodico p1 = new Periodico();

        ag.addObservador(t1);
        ag.addObservador(t2);
        ag.addObservador(p1);

        Noticia n1 = new Noticia("Ha subido la gasolina");
        ag.addNoticia(n1);

        Noticia n2 = new Noticia("Ha subido el pollo");
        ag.addNoticia(n2);

        // Noticia n1 = new Noticia("Ha subido la gasolina");
        // ag.addNoticia(n1);

        // Noticia n2 = new Noticia("Ha subido el pollo");
        // ag.addNoticia(n2);

        // Television tv = new Television();
        // tv.emitirNoticia(n2);
        // Periodico pe = new Periodico();
        // pe.emitirNoticia(n2);

        // ag.emitirNoticiaPeriodico(n2);
        // ag.emitirNoticiaTelevision(n2);
    }
}
