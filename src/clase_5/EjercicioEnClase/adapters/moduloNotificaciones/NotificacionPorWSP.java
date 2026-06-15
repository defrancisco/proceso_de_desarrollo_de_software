package clase_5.EjercicioEnClase.adapters.moduloNotificaciones;

import clase_5.EjercicioEnClase.adapters.Adaptor.whatsapp.AdapterNotificadorWSP;

public class NotificacionPorWSP implements EstrategiaDeNotificacion {
    private AdapterNotificadorWSP adapter;

    public void setAdapter(AdapterNotificadorWSP adapter) {
        this.adapter = adapter;
    }

    public NotificacionPorWSP(AdapterNotificadorWSP adapter) {
        super();
        this.adapter = adapter;
    }

    public void enviar(Notificacion notificacion) {
        this.adapter.enviarWSP(notificacion);
    }

}
