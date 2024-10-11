package co.edu.uniquindio.patronesDiseno.FactoryMethod.factory;

import co.edu.uniquindio.patronesDiseno.FactoryMethod.model.WhatsApp;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.services.Notificacion;

public class WhatsAppFactory extends NotificacionFactory {
    private String numeroTelefono;
    private String mensaje;
    private String archivoAdjunto;
    public WhatsAppFactory(String numeroTelefono, String mensaje, String archivoAdjunto) {
        this.numeroTelefono = numeroTelefono;
        this.mensaje = mensaje;
        this.archivoAdjunto = archivoAdjunto;
    }
    @Override
    public Notificacion crearNotificacion() {
        return new WhatsApp(numeroTelefono, mensaje, archivoAdjunto);
    }
}
