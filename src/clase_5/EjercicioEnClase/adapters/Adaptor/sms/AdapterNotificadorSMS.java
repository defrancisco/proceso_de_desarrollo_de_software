package clase_5.EjercicioEnClase.adapters.Adaptor.sms;

import clase_5.EjercicioEnClase.adapters.moduloNotificaciones.Notificacion;


public interface AdapterNotificadorSMS {
    void enviarSMS(Notificacion notificacion);
}
