package clase_5.Modulo_de_Envio_de_Notificaciones.wsp;

import clase_5.Modulo_de_Envio_de_Notificaciones.Notificacion;

public class AdapterWhatsAppTwilio implements AdapterNotificadorWhatsApp {
    @Override
    public void enviarWhatsApp(Notificacion notificacion) {
        System.out.println("Enviando WhatsApp Twilio...");
    }
}
