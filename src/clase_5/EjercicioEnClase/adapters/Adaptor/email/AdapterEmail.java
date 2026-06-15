package clase_5.EjercicioEnClase.adapters.Adaptor.email;


import clase_5.EjercicioEnClase.adapters.moduloNotificaciones.Notificacion;

public class AdapterEmail implements AdapterNotificadorEmail {

    public void enviarEmail(Notificacion notificacion){
        System.out.println("Enviando email a "
        + notificacion.getNroCompletoDestinatario() + " por Twilio: " +
                " " + notificacion.getMensaje() + "'"

        );
    }


}
