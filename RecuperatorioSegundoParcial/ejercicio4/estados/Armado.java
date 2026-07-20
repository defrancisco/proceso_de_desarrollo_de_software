package ejercicio4.estados;

import ejercicio4.AlarmaContext;

public class Armado implements iEstadosAlarma {
    private AlarmaContext alarma;

    public Armado(AlarmaContext alarma){
        this.alarma = alarma;
    }

    @Override
    public void armar() {
        System.out.println("Se le informa que ha Armado la alarma");
    }

    @Override
    public void sensorActivado() {
        // (retardo de entrada: el usuario tiene tiempo de desarmar).

        System.out.println("Pasando Alarma a Estado [EnRetardo]");
        alarma.setEstadosActual( new EnRetardo(alarma) );
    }

    @Override
    public void desarmar(int pin) {
        // CORRECCIÓN: Uso estricto de if / else
        // El PIN correcto es un dato del panel (por ejemplo, «1234»)
        if(pin == alarma.getPinCorrecto()){
            System.out.println("Pasando Alarma a Estado [Desarmado]");
            alarma.setEstadosActual( new Desarmado(alarma) );

        } else{
            System.out.println("[ERROR] El pin ingresado no es el correcto");
            // no se cambia el estado, permanece armado
        }
    }

}
