package clase_5.Modulo_de_Envio_de_Notificaciones.email;


import clase_5.Modulo_de_Envio_de_Notificaciones.Notificacion;

public class AdapterJavaEmail implements AdapterNotificadorEmail {

    public void enviarEmail(Notificacion notificacion) {
        System.out.println("Enviando email a " + notificacion.getEmailDestinatario() +
                " por Twilio: " + "'" + notificacion.getMensaje() + "'.");
    }
}
