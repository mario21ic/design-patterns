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
        
        // FacturaConIGV f1 = new FacturaConIGV(1, "laptop", 100);
        // System.out.println(f1.getImporteTotal());
        // FacturaSinIGV f2 = new FacturaSinIGV(2, "laptop", 100);
        // System.out.println(f2.getImporteTotal());

        Factura f1 = FacturaFactory.getFactura(1, "laptop", 100.0, TipoFactura.CONIGV);
        System.out.println(f1.getImporteTotal());
        
        Factura f2 = FacturaFactory.getFactura(1, "laptop", 100.0, TipoFactura.SINIGV);
        System.out.println(f2.getImporteTotal());
    }
}
