package clase_5.Modulo_de_Envio_de_Notificaciones;

import clase_5.Modulo_de_Envio_de_Notificaciones.wsp.AdapterNotificadorWhatsApp;

public class NotificacionPorWhatsApp implements EstrategiaDeNotificacion {
    private AdapterNotificadorWhatsApp adapter;


    public void setAdapter(AdapterNotificadorWhatsApp adapter) {
        this.adapter = adapter;
    }

    public NotificacionPorWhatsApp(AdapterNotificadorWhatsApp adapter) {
        super();
        this.adapter = adapter;
    }


    @Override
    public void enviar(Notificacion notificacion) {
        this.adapter.enviarWhatsApp(notificacion);
    }
}
