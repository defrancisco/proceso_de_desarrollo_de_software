package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Armado implements iEstadosAlarma {
    private AlarmaContext alarma;

    @Override
    public void armar() {
        System.out.println("Se le informa que ha Armado la alarma");
    }

    @Override
    public void sensorActivado() {
        // (retardo de entrada: el usuario tiene tiempo de desarmar).
        alarma.setEstadosActual( new EnRetardo() );
        System.out.println("Pasando Alarma a Estado [EnRetardo]");
    }

    @Override
    public void desarmar(int pin) {
        // El PIN correcto es un dato del panel (por ejemplo, «1234»)
        if(pin == 1234){
            alarma.setEstadosActual( new Desarmado() );
            System.out.println("Pasando Alarma a Estado [Desarmado]");
        }
        System.out.println("[ERROR] El pin ingresado no es el correcto");
        // no se cambia el estado, permanece armado
    }
}
