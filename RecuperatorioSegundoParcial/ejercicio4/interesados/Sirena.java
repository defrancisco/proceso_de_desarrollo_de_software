package ejercicio4.interesados;

import ejercicio4.iObserver;

public class Sirena implements iObserver {
    @Override
    public void alarma() {
        System.out.println("[SIRENA] ¡BIIIP BIIIP! Sirena sonando a todo volumen.");

    }
}
