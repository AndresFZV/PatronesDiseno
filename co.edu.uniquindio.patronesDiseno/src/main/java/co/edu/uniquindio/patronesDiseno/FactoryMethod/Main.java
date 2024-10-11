package co.edu.uniquindio.patronesDiseno.FactoryMethod;

import co.edu.uniquindio.patronesDiseno.FactoryMethod.factory.CorreoFactory;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.factory.NotificacionFactory;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.factory.SMSFactory;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.factory.WhatsAppFactory;
import co.edu.uniquindio.patronesDiseno.FactoryMethod.services.Notificacion;

public class Main {
    public static void main(String[] args) {
// Crear una fábrica para notificaciones por correo y enviar un mensaje
        NotificacionFactory correoFactory = new CorreoFactory("example@mail.com", "Bienvenida", "¡Bienvenido a nuestra aplicación!");
        Notificacion correo = correoFactory.crearNotificacion();
        correo.enviarMensaje();

        // Crear una fábrica para notificaciones por SMS y enviar un mensaje
        NotificacionFactory smsFactory = new SMSFactory("+1234567890", "Tu código de verificación es 1234");
        Notificacion sms = smsFactory.crearNotificacion();
        sms.enviarMensaje();

        // Crear una fábrica para notificaciones por WhatsApp y enviar un mensaje
        NotificacionFactory whatsappFactory = new WhatsAppFactory("+0987654321", "Hola, ¿cómo estás?", "imagen.png");
        Notificacion whatsapp = whatsappFactory.crearNotificacion();
        whatsapp.enviarMensaje();
    }
}
