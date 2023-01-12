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
        
        Persona p = new Persona("123", "Mario", "mario21ic@gmail.com");

        // ServicioValidacion sv = new ServicioValidacion();
        // sv.validar(p.getDni());
        // ServicioBaseDatos sbd = new ServicioBaseDatos();
        // sbd.insertar(p);
        // ServicioCorreo sc = new ServicioCorreo();
        // sc.enviar(p.getCorreo(), "Hola bienvenido a nuestra app");
        ServicioFaccade faccade = new ServicioFaccade();
        faccade.procesarPersona(p);

    }
}
