package ejercicio4.interesados;

import ejercicio4.iObserver;

public class AvisoALaPolicia implements iObserver {
    @Override
    public void alarma() {
        System.out.println("[LLAMADA] Realizando llamada a la Policia.");

    }
}
