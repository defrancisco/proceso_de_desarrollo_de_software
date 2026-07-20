package ejercicio4.interesados;

import ejercicio4.iObserver;

public class AvisoALaPolicia implements iObserver {
    @Override
    public void alarma() {
        System.out.println("[POLICÍA] Llamada automática al 911 en curso...");

    }
}
