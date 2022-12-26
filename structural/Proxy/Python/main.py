class Telefono:
    def __init__(self, numero):
        self.numero = numero
    def enviarVoz(self, mensaje):
        pass

class TelefonoNormal(Telefono):
    def enviarVoz(self, mensaje):
        print(f"Normal: Enviar voz a {self.numero} - {mensaje}")

class TelefonoSmart(Telefono):
    def enviarVoz(self, mensaje):
        print(f"Smart: Enviar voz a {self.numero} - {mensaje}")
    def enviarVideo(self):
        print(f"Smart: Enviar video")

class TelefonoProxy(Telefono):
    def __init__(self, numero):
        self.telefono = TelefonoNormal(numero)
    def enviarVoz(self, mensaje):
        print("Pinchado: Grabando mensaje", mensaje)
        self.telefono.enviarVoz(mensaje)

class TelefonoFactory:
    def getInstance(numero: int, tipo: str="") -> Telefono:
        if tipo == "normal":
            # return TelefonoNormal(numero)
            return TelefonoProxy(numero)
        return TelefonoSmart(numero)

def main():
    print("Starting..")
    """
    t1 = TelefonoNormal(12345678)
    t2 = TelefonoSmart(12345678)
    t3 = TelefonoProxy(12345678)
    """
    t1 = TelefonoFactory.getInstance(12345678, "normal")
    t2 = TelefonoFactory.getInstance(12345678, "normal")
    t3 = TelefonoFactory.getInstance(12345678)
    t1.enviarVoz("Hello moto")
    print("="*10)
    t2.enviarVoz("Hello moto")
    print("="*10)
    t3.enviarVoz("Hello moto")

if __name__=="__main__":
    main()
