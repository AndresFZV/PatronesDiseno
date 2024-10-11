package co.edu.uniquindio.patronesDiseno.FactoryMethod.model;


import co.edu.uniquindio.patronesDiseno.FactoryMethod.services.Notificacion;

public class CorreoElectronico implements Notificacion {
    private String destinatario;
    private String asunto;
    private String cuerpo;
    public CorreoElectronico(String destinatario, String asunto, String cuerpo) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }
    @Override
    public void enviarMensaje() {
        System.out.println("Enviando correo a: "+destinatario+"\n"+"Asunto: "+asunto+"\n"+cuerpo+"\n");
    }
}
