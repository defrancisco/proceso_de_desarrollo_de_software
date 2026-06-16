package clase_10.modulo_flip_flop;


public class EnviarPushNotification implements Accionable {
    @Override
    public void ejecutar(Moderable moderable) {
        System.out.println("[Push Notification] Notificación enviada al usuario con el resultado del análisis.");
    }
}