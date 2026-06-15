package clase_5.EjercicioEnClase.adapters.Adaptor.whatsapp;

import clase_5.EjercicioEnClase.adapters.moduloNotificaciones.Notificacion;

public class AdapterWSP implements AdapterNotificadorWSP {


    public void enviarWSP(Notificacion notificacion) {
        System.out.println("Enviando Mensaje por WhatsApp: " + notificacion.getMensaje());
    }
}
