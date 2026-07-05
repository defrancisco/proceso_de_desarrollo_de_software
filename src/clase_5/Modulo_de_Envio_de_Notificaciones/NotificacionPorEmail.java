package clase_5.Modulo_de_Envio_de_Notificaciones;

import clase_5.Modulo_de_Envio_de_Notificaciones.email.AdapterNotificadorEmail;

public class NotificacionPorEmail implements EstrategiaDeNotificacion {
    private AdapterNotificadorEmail adapter;

    public void  setAdapter(AdapterNotificadorEmail adapter) {
        this.adapter = adapter;
    }

    public NotificacionPorEmail(AdapterNotificadorEmail adapter) {
        super();
        this.adapter = adapter;
    }

    @Override
    public void enviar(Notificacion notificacion) {
        this.adapter.enviarEmail(notificacion);

    }
}
