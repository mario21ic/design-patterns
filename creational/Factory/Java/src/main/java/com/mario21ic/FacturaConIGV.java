package com.mario21ic;

public class FacturaConIGV extends Factura {

    public FacturaConIGV(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteTotal() {
        return getImporte() * 1.18;
    }
    
}
