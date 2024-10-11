package co.edu.uniquindio.patronesDiseno.FactoryMethod.model;

import co.edu.uniquindio.patronesDiseno.FactoryMethod.services.Notificacion;

public class SMS implements Notificacion {
    private String numeroTelefono;
    private String mensaje;
    public SMS(String numeroTelefono, String mensaje) {
        this.numeroTelefono = numeroTelefono;
        this.mensaje = mensaje;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS A: "+numeroTelefono+"\n"+"Mensaje: "+mensaje+"\n");
    }
}
