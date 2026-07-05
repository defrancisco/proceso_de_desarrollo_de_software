package clase_5.Modulo_de_Envio_de_Notificaciones;

public class Notificador {
    public EstrategiaDeNotificacion estrategiaDeNotificacion;

    public void enviar(Notificacion notificacion) {
        this.estrategiaDeNotificacion.enviar(notificacion);
    }

    public void setEstrategiaDeNotificacion(EstrategiaDeNotificacion estrategiaDeNotificacion) {
        this.estrategiaDeNotificacion = estrategiaDeNotificacion;
    }
}
