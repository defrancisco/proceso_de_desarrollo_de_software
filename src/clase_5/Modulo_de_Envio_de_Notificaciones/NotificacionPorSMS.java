package clase_5.Modulo_de_Envio_de_Notificaciones;

import clase_5.Modulo_de_Envio_de_Notificaciones.sms.AdapterNotificadorSMS;

public class NotificacionPorSMS implements EstrategiaDeNotificacion {
    private AdapterNotificadorSMS adapter;

    public void setAdapter(AdapterNotificadorSMS adapter) {
        this.adapter = adapter;
    }

    public NotificacionPorSMS(AdapterNotificadorSMS adapter) {
        super();
        this.adapter = adapter;
    }

    @Override
    public void enviar(Notificacion notificacion) {
        this.adapter.enviarSMS(notificacion);
    }
}
