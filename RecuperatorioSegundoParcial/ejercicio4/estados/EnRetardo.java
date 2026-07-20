package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class EnRetardo implements iEstadosAlarma {
    private AlarmaContext alarma;

    public EnRetardo(AlarmaContext alarma){
        this.alarma = alarma;
    }

    @Override
    public void armar() {
        throw new IllegalStateException("Operación Inválida.");
    }

    @Override
    public void sensorActivado() {
        // representa que venció el retardo sin desarmar
        alarma.setEstadosActual( new Disparado(alarma));
        System.out.println("[ALERTA] Sensor Disparado");
        alarma.notificar(); // Trigger de notificación a todos los Observers
    }

    @Override
    public void desarmar(int pin) {
        // CORRECCIÓN: Uso estricto de if / else
        if(pin == alarma.getPinCorrecto()){
            System.out.println("[ALERTA] Sensor Desarmado. Se evito la falsa alarma");
            alarma.setEstadosActual(new Desarmado(alarma));
        }else{
            System.out.println("[ERROR] PIN incorrecto en retardo.");
        }

    }
}
