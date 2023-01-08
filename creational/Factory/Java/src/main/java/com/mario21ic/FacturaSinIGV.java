package com.mario21ic;

public class FacturaSinIGV extends Factura {

    public FacturaSinIGV(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteTotal() {
        return getImporte();
    }
    
}
