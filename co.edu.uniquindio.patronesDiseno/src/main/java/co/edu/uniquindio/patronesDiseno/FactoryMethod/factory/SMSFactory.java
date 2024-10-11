package co.edu.uniquindio.patronesDiseno.FactoryMethod.factory;

import FactoryMethod.model.SMS;
import FactoryMethod.services.Notificacion;

public class SMSFactory extends NotificacionFactory {
    private String numeroTelefono;
    private String mensaje;
    public SMSFactory(String numeroTelefono, String mensaje) {
        this.numeroTelefono = numeroTelefono;
        this.mensaje = mensaje;
    }
    @Override
    public Notificacion crearNotificacion() {
        return new SMS(numeroTelefono, mensaje);
    }
}
