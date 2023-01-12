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
        
        RegaloCaja superCaja = new RegaloCaja("superCaja");
        superCaja.addRegalo(new RegaloSencillo("libro"));
        superCaja.addRegalo(new RegaloSencillo("auricular"));

        RegaloCaja miniCaja = new RegaloCaja("miniCaja");
        miniCaja.addRegalo(new RegaloSencillo("anillo"));
        miniCaja.addRegalo(new RegaloSencillo("pendientes"));

        superCaja.addRegalo(miniCaja);

        // for (Regalo r: superCaja.getRegalos()) {
        //     System.out.println(r.getNombre());
        //     if (r.esCajaRegalo()) {
        //         System.out.println("==");
        //         for (Regalo mini: r.getRegalos()) {
        //             System.out.println(mini.getNombre());
        //         }
        //     }
        // }

        imprimirRegalos(superCaja);
        
    }

    public static void imprimirRegalos(Regalo regalo) {
        if (!regalo.esCajaRegalo()) {
            System.out.println(regalo.getNombre());
        } else {
            for (Regalo r: regalo.getRegalos()) {
                imprimirRegalos(r);
            }
        }
    }
}
