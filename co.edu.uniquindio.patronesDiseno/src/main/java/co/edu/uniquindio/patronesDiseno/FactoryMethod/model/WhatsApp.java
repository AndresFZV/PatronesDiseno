package co.edu.uniquindio.patronesDiseno.FactoryMethod.model;

import FactoryMethod.services.Notificacion;

public class WhatsApp implements Notificacion {
    private String numeroTelefono;
    private String mensaje;
    private String archivoAdjunto;
    public WhatsApp(String numeroTelefono, String mensaje, String archivoAdjunto) {
        this.numeroTelefono = numeroTelefono;
        this.mensaje = mensaje;
        this.archivoAdjunto = archivoAdjunto;
    }
    @Override
    public void enviarMensaje() {
        String infoAdjunto = (archivoAdjunto != null) ? "archivo adjunto: " + archivoAdjunto : "";
        System.out.println("Enviando mensaje de WhatsApp a: "+numeroTelefono+"\n"+mensaje+"\n"+infoAdjunto+"\n");
    }
}
