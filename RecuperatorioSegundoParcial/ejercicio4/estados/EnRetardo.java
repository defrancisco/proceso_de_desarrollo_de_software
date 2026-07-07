package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class EnRetardo implements iEstadosAlarma {
    private AlarmaContext alarma;

    @Override
    public void armar() {
        throw new IllegalStateException("Operación Inválida.");
    }

    @Override
    public void sensorActivado() {
        // representa que venció el retardo sin desarmar
        alarma.setEstadosActual( new Disparado());
        System.out.println("[ALERTA] Sensor Disparado");
        // Trigger para notificar a los interesados
        alarma.notificar();
    }

    @Override
    public void desarmar(int pin) {
        if(pin == 1234){
            alarma.setEstadosActual(new Desarmado());
            System.out.println("[ALERTA] Sensor Desarmado. Se evito la falsa alarma");
        }
        System.out.println("Pin Incorrecto");
    }
}
