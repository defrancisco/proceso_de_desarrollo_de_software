package ejercicio4;

import ejercicio4.estados.Desarmado;
import ejercicio4.estados.iEstadosAlarma;

import java.util.ArrayList;
import java.util.List;


public class AlarmaContext implements iObservables, iEstadosAlarma {
    private iEstadosAlarma estadosActual; // Patron State
    private List<iObserver> observers; // Patron Observer
    private static AlarmaContext instance = null; // Patron Singleton

    // Constructor en Privado
    private AlarmaContext() {
        this.estadosActual = new Desarmado();
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

    @Override
    public void sensorActivado(){
        this.estadosActual.sensorActivado();
    }

    @Override
    public void armar(){
        this.estadosActual.armar();
    }

    @Override
    public void desarmar(int pin){
        this.estadosActual.desarmar(pin);
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
