package clase_5.EjercicioEnClase.adapters.moduloNotificaciones;

public class Notificador {
    // 1. Atributo privado de tipo interfaz
    private EstrategiaDeNotificacion estrategia;

    // 2. Metodos
    public void enviar(Notificacion notificacion) {
        this.estrategia.enviar(notificacion);
    }

    public void setEstrategia(EstrategiaDeNotificacion estrategia) {
        this.estrategia = estrategia;
    }
}
