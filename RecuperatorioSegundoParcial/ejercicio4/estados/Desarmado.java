package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Desarmado implements iEstadosAlarma {
    private AlarmaContext alarma;

    @Override
    public void armar() {
        alarma.setEstadosActual(new Armado());
        System.out.println("Pasando Alarma a Estado [Armada]");
    }

    @Override
    public void sensorActivado() {
        // no hace nada (la casa está en uso).
    }

    @Override
    public void desarmar(int pin) {
        System.out.println("Se le informa que ha desarmado la Alarma");
    }
}
