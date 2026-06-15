package clase_5.EjercicioEnClase.adapters.Adaptor.sms;

import clase_5.EjercicioEnClase.adapters.moduloNotificaciones.Notificacion;

public class AdapterSMS implements AdapterNotificadorSMS {

    public void enviarSMS(Notificacion notificacion) {
        System.out.println("Enviando mensje por SMS: " + notificacion.getMensaje());

    }

}
