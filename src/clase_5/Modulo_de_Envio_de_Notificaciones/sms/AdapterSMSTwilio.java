package clase_5.Modulo_de_Envio_de_Notificaciones.sms;
import clase_5.Modulo_de_Envio_de_Notificaciones.Notificacion;

public class AdapterSMSTwilio implements AdapterNotificadorSMS {

    @Override
    public void enviarSMS(Notificacion notificacion) {
        System.out.println("Enviando SMS por Twilio...");
    }
}
