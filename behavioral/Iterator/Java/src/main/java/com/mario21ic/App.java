package com.mario21ic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting.." );
        
        // ArrayList<String> lista = new ArrayList<String>();
        // lista.add("hola");
        // lista.add("que");
        // lista.add("tal");
        // lista.add("estas");

        // Iterator<String> it = lista.iterator();
        // // con un iterador es mas simple
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // System.out.println("===");
        // // mucho mas claro, pero inferior. Requiere saber posición y estructura.
        // for (int i=0;i<lista.size();i++) {
        //     System.out.println(lista.get(i));
        // }

        Mochila m = new Mochila();
        m.setZona1("navaja");
        m.setZona2("bocadillo");
        m.setZona3("agua");
        m.setZona4("telefono");

        Iterator<String> it = m.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("===");
        
        // Volvemos a iterar
        Iterator<String> it2 = m.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        System.out.println("***");

        // otra forma de iterar
        for(String zona: m) {
            System.out.println(zona);
        }
    }
}

