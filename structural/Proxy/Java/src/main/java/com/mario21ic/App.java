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

        // Telefono t1 = new TelefonoNormal("12345678");
        // Telefono t2 = new TelefonoSmart("87654321");
        // Telefono t3 = new TelefonoProxy("56781234");
        Telefono t1 = TelefonoFactory.getInstance("12345678", "normal");
        Telefono t2 = TelefonoFactory.getInstance("87654321", "normal");
        Telefono t3 = TelefonoFactory.getInstance("56781234", "smart");

        t1.enviarVoz("Hello moto");
        System.out.println("=======");

        t2.enviarVoz("Hello world");
        System.out.println("=======");

        t3.enviarVoz("Hello mundo");
    }
}
