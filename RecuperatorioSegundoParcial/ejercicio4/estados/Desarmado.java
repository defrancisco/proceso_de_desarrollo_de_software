package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Desarmado implements iEstadosAlarma {
    private AlarmaContext alarma;

    // CORRECCIÓN CRÍTICA: El constructor recibe y guarda el contexto
    public Desarmado(AlarmaContext alarma){
        this.alarma = alarma;
    }

    @Override
    public void armar() {

        System.out.println("Pasando Alarma a Estado [Armada]");
        alarma.setEstadosActual(new Armado(alarma));
    }

    @Override
    public void sensorActivado() {
        System.out.println("Sensor activado, pero no hace nada (la casa está en uso).");
        // no hace nada (la casa está en uso).
    }

    @Override
    public void desarmar(int pin) {
        System.out.println("Se le informa que ha desarmado la Alarma");
    }
}
