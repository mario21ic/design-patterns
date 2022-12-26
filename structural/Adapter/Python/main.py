class Conectable:
    def on(self):
        pass
    def off(self):
        pass

class Lampara(Conectable):
    def on(self):
        print("Lampara encendida")
    def off(self):
        print("Lampara apagada")

class Televisor(Conectable):
    def on(self):
        print("Televisor encendido")
    def off(self):
        print("Televisor apagado")


class Regleta:
    def __init__(self):
        self.items = []
    def addConectable(self, elemento):
        self.items.append(elemento)
    def encender(self):
        for c in self.items:
            c.on()

class Portatil:
    def up(self):
        print("Laptop is on")
    def down(self):
        print("Laptop is off")

class AdaptadorPortatil(Conectable):
    def __init__(self, portatil):
        self.portatil = portatil
    def on(self):
        self.portatil.up()
    def off(self):
        self.portatil.down()

def main():
    print("Starting..")
    c1 = Lampara()
    c2 = Televisor()
    """
    c1.on()
    c2.on()
    """
    r = Regleta()
    r.addConectable(c1)
    r.addConectable(c2)
    c3 = Portatil()
    a1 = AdaptadorPortatil(c3)
    r.addConectable(a1)

    r.encender()
    

if __name__=="__main__":
    main()
