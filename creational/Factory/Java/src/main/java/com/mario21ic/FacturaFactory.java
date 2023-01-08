package com.mario21ic;

public class FacturaFactory {
    public static Factura getFactura(int numero, String concepto, double importe, TipoFactura tipo) {
        // if (tipo.equals(TipoFactura.CONIGV)) {
        if (tipo == TipoFactura.CONIGV) {
            return new FacturaConIGV(numero, concepto, importe);
        }
        return new FacturaSinIGV(numero, concepto, importe);
    }
}
