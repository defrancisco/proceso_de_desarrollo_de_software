package ejercicio4;

import ejercicio4.estados.Desarmado;
import ejercicio4.estados.iEstadosAlarma;

import java.util.ArrayList;
import java.util.List;


public class AlarmaContext implements iObservables, iEstadosAlarma {
    private iEstadosAlarma estadosActual; // Patron State
    private List<iObserver> observers; // Patron Observer
    private static AlarmaContext instance = null; // Patron Singleton
    private final int pinCorrecto = 1234; // Contraseña


    // Constructor en Privado
    private AlarmaContext() {
        // Al instanciar, pasamos 'this' (el contexto) al estado inicial
        this.estadosActual = new Desarmado(this);
        this.observers = new ArrayList<>();
    }

    
    // PATRON SINLGETON - En Static
    public static AlarmaContext getInstance() {
        if (instance == null) {
            instance = new AlarmaContext();
        }
        return instance;
    }


    // PATRON STATE
    public void setEstadosActual(iEstadosAlarma estadoNuevo) {
        this.estadosActual = estadoNuevo;

    }
    // AGREGO EL MÉTODO PARA SETEAR EL PIN
    public int getPinCorrecto() {
        return pinCorrecto;
    }


    // Delegación del Patrón State
    @Override
    public void sensorActivado(){
        estadosActual.sensorActivado();
    }

    @Override
    public void armar(){

        estadosActual.armar();
    }

    @Override
    public void desarmar(int pin){

        estadosActual.desarmar(pin);
    }


    // PATRON OBSERVER
    @Override
    public void addObserver(iObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(iObserver o) {
        observers.remove(o);
    }

    @Override
    public void notificar() {
        for(iObserver o : observers){
            o.alarma();
        }
    }
}
