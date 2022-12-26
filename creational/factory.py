class Factura:
    def __init__(self, numero: int, concepto: str, importe: int):
        self.numero = numero
        self.concepto = concepto
        self.importe = importe
    def getImporteTotal(self):
        pass

class FacturaConIGV(Factura):
    def getImporteTotal(self) -> float:
        return self.importe * 1.18

class FacturaSinIGV(Factura):
    def getImporteTotal(self) -> float:
        return float(self.importe)

from enum import Enum, auto
class TipoFactura(Enum):
    IGV = auto()
    SINIGV = auto()

class FacturaFactory:
    def getFactura(numero: int, concepto: str, importe: int, tipo=None) -> Factura:
        if tipo == TipoFactura.IGV:
            return FacturaConIGV(numero, concepto, importe)
        return FacturaSinIGV(numero, concepto, importe)

def main():
    print("main")

    # f1 = FacturaConIGV(11, "m1", 100)
    f1 = FacturaFactory.getFactura(11, "m1", 100, TipoFactura.IGV)
    print(f1.getImporteTotal())

    # f2 = FacturaSinIGV(12, "m2", 100)
    f2 = FacturaFactory.getFactura(12, "m2", 100)
    print(f2.getImporteTotal())
    

if __name__=="__main__":
    main()
