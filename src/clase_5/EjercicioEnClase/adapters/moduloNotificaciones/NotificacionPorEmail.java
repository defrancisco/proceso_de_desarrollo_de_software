package clase_5.EjercicioEnClase.adapters.moduloNotificaciones;

import clase_5.EjercicioEnClase.adapters.Adaptor.email.AdapterNotificadorEmail;

public class NotificacionPorEmail implements EstrategiaDeNotificacion{
    private AdapterNotificadorEmail adapter;

    public void setAdapter(AdapterNotificadorEmail adapter) {
        this.adapter = adapter;
    }

    public NotificacionPorEmail( AdapterNotificadorEmail adapter) {
        super();
        this.adapter = adapter;
    }

    public void enviar(Notificacion notificacion) {
        this.adapter.enviarEmail(notificacion);
    }
}
