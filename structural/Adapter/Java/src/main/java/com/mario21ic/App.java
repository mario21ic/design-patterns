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

        Conectable c1 = new Lampara();
        Conectable c2 = new Televisor();
        // c1.on();
        // c2.on();

        Regleta r1 = new Regleta();
        r1.addConectable(c1);
        r1.addConectable(c2);

        Portatil c3 = new Portatil();
        AdaptadorPortatl a1 = new AdaptadorPortatl(c3);
        r1.addConectable(a1);

        r1.encender();
    }
}
