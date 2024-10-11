package co.edu.uniquindio.patronesDiseno.FactoryMethod.factory;

import co.edu.uniquindio.patronesDiseno.FactoryMethod.model.CorreoElectronico;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.services.Notificacion;

public class CorreoFactory extends  NotificacionFactory {
    private String destinatario;
    private String asunto;
    private String cuerpo;
    public CorreoFactory(String destinatario, String asunto, String cuerpo) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    @Override
    public Notificacion crearNotificacion() {
        return new CorreoElectronico(destinatario, asunto, cuerpo);

    }
}
