class Camiseta:
    def __init__(self, numero: int=0, jugador: str=""):
        self.numero = numero
        self.jugador = jugador

class CamisetaMadrid(Camiseta):
    def imprimir(self):
        print("escudo madrid")
        print(self.numero)
        print(self.jugador)

class CamisetaBarcelona(Camiseta):
    def imprimir(self):
        print("escudo barcelona")
        print(self.numero)
        print(self.jugador)

class CamisetaFactory:
    def getInstance(tipo):
        if tipo == "madrid":
            return CamisetaMadrid()
        return CamisetaBarcelona()


class Pantalon:
    def __init__(self, numero: int=0):
        self.numero = numero

class PantalonMadrid(Pantalon):
    def imprimir(self):
        print("p escudo madrid")
        print(self.numero)

class PantalonBarcelona(Pantalon):
    def imprimir(self):
        print("p escudo barcelona")
        print(self.numero)

class PantalonFactory:
    def getInstance(tipo):
        if tipo == "madrid":
            return PantalonMadrid()
        return PantalonBarcelona()

class RopaFactory:
    def getCamiseta(self):
        pass
    def getPantalon(self):
        pass
    def getInstance(tipo):
        if tipo == "madrid":
            return RopaFactoryMadrid()
        return RopaFactoryBarcelona()

class RopaFactoryMadrid(RopaFactory):
    def getCamiseta(self):
        return CamisetaMadrid()
    def getPantalon(self):
        return PantalonMadrid()
class RopaFactoryBarcelona(RopaFactory):
    def getCamiseta(self):
        return CamisetaBarcelona()
    def getPantalon(self):
        return PantalonBarcelona()

def main():
    """
    c1 = CamisetaFactory.getInstance("madrid")
    c1.numero = 11
    c1.jugador = "player1"
    c1.imprimir()
    print("*"*10)
    c2 = CamisetaFactory.getInstance("barcelona")
    c2.numero = 12
    c2.jugador = "player2"
    c2.imprimir()

    print("="*10)

    p1 = PantalonFactory.getInstance("madrid")
    p1.numero = 11
    p1.imprimir()
    print("*"*10)
    p2 = PantalonFactory.getInstance("barcelona")
    p2.numero = 12
    p2.imprimir()
    """
    factoria1 = RopaFactory.getInstance("madrid")
    c1 = factoria1.getCamiseta()
    print(c1)
    c1.numero = 11
    c1.jugador = "player1"
    c1.imprimir()
    print("*"*10)
    p1 = factoria1.getPantalon()
    print(p1)
    p1.numero = 11
    p1.imprimir()

    print("="*10)

    factoria2 = RopaFactory.getInstance("barcelona")
    c2 = factoria2.getCamiseta()
    print(c2)
    c2.numero = 11
    c2.jugador = "player1"
    c2.imprimir()
    print("*"*10)
    p2 = factoria2.getPantalon()
    print(p2)
    p2.numero = 11
    p2.imprimir()

if __name__=="__main__":
    main()
