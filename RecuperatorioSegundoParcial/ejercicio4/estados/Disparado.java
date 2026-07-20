package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Disparado implements iEstadosAlarma {
    private AlarmaContext alarma;

    public Disparado(AlarmaContext alarma){
        this.alarma = alarma;
    }

    @Override
    public void armar() {
        // CORRECCIÓN: Informar que la alarma está sonando
        System.out.println("¡LA ALARMA ESTÁ SONANDO! Operación no disponible.");
    }

    @Override
    public void sensorActivado() {
        // CORRECCIÓN: Informar que la alarma está sonando
        System.out.println("¡LA ALARMA ESTÁ SONANDO! El sensor detecta movimiento continuo.");
    }

    @Override
    public void desarmar(int pin) {
        // CORRECCIÓN: Uso estricto de if / else
        if (pin == alarma.getPinCorrecto()) {
            System.out.println("PIN correcto. Alarma silenciada y desarmada.");
            alarma.setEstadosActual(new Desarmado(alarma));
        } else {
            System.out.println("[ERROR] PIN incorrecto. ¡LA ALARMA SIGUE SONANDO!");
        }
    }
}
