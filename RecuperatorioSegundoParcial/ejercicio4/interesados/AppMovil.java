package ejercicio4.interesados;

import ejercicio4.iObserver;

public class AppMovil implements iObserver {
    @Override
    public void alarma() {
        System.out.println("[NOTIFICACION PUSH] Enviando Notificacion a Vecinos.");

    }
}
