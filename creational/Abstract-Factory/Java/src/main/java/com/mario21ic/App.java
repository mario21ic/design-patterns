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
        
        RopaAbstractFactory factoria1 = RopaAbstractFactory.getInstance("madrid");
        
        Camiseta c1 = factoria1.getCamiseta();
        c1.setNumero(11);
        c1.setJugador("player1");
        c1.imprimir();
        System.out.println("*********");
        Pantalon p1 = factoria1.getPantalon();
        p1.setNumero(11);
        p1.imprimir();

        System.out.println("========");
        
        RopaAbstractFactory factoria2 = RopaAbstractFactory.getInstance("barcelona");
        Camiseta c2 = factoria2.getCamiseta();
        c2.setNumero(12);
        c2.setJugador("player2");
        c2.imprimir();
        System.out.println("*********");
        Pantalon p2 = factoria2.getPantalon();
        p2.setNumero(12);
        p2.imprimir();
    }
}
