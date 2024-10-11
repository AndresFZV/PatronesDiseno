package co.edu.uniquindio.patronesDiseno.FactoryMethod;

import FactoryMethod.factory.CorreoFactory;
import FactoryMethod.factory.NotificacionFactory;
import FactoryMethod.factory.SMSFactory;
import FactoryMethod.factory.WhatsAppFactory;
import FactoryMethod.services.Notificacion;

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
