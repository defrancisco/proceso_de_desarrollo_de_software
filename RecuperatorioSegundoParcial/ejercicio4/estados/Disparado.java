package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Disparado implements iEstadosAlarma {
    private AlarmaContext alarma;

    @Override
    public void armar() {
        System.out.println("[ALERTA] Sensor Disparado");
    }

    @Override
    public void sensorActivado() {
        System.out.println("[ALERTA] Sensor Disparado");
    }

    @Override
    public void desarmar(int pin) {
        if(pin == 1234){
            alarma.setEstadosActual(new Desarmado());
            System.out.println("[ALERTA] Sensor desarmado.");
        }
        System.out.println("Pin Incorrecto. Sensor Disparado aún");
    }
}
