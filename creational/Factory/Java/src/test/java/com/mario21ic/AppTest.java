package com.mario21ic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing IGV
     */
    @Test
    public void facturaConIGV()
    {
        Factura f1 = FacturaFactory.getFactura(1, "laptop", 100.0, TipoFactura.CONIGV);
        assertTrue( f1.getImporteTotal()==118.0);
    }

    /**
     * Testing SINIGV
     */
    @Test
    public void facturaSinIGV()
    {
        Factura f1 = FacturaFactory.getFactura(1, "laptop", 100.0, TipoFactura.SINIGV);
        assertTrue( f1.getImporteTotal()==100.0);
    }
}
