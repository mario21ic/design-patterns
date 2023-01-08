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
        
        Documento d1 = new Documento();
        d1.setParrafo1("parr1");
        d1.setParrafo2("parr2");
        d1.setParrafo3("parr3");

        Documento d2 = (Documento) d1.clone();
        d1.setParrafo1("inicio");

        System.out.println(d2.getParrafo1());
        System.out.println(d2.getParrafo2());
        System.out.println(d2.getParrafo3());

        // Distintos
        System.out.println(d1);
        System.out.println(d2);
    }
}
