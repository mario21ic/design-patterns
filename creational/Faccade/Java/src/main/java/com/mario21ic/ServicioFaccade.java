package com.mario21ic;

public class ServicioFaccade {
    
    private ServicioCorreo sc = new ServicioCorreo();
    private ServicioBaseDatos sbd = new ServicioBaseDatos();
    private ServicioValidacion sv = new ServicioValidacion();

    public void procesarPersona( Persona persona) {
        if (sv.validar(persona.getDni())) {
            sbd.insertar(persona);
            sc.enviar(persona.getCorreo(), "Hola bienvenido a nuestra pp");
        }
    }
}
