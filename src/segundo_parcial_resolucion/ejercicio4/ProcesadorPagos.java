package segundo_parcial_resolucion.ejercicio4;

import segundo_parcial_resolucion.ejercicio4.estados.ValidandoDatos;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorPagos implements iObervable{
    private List<iObserver> observadores;
    private iEstadosProcesador estadoActual;


    public ProcesadorPagos(){
        this.observadores = new ArrayList<iObserver>();
        this.estadoActual = new ValidandoDatos();
    }



    //------PATRON STATE--------

    public void setEstadoActual(iEstadosProcesador nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void verificar(){
        this.estadoActual.verificar(this);
    }

    public void emitirComprobante(){
        this.estadoActual.emitirComprobante(this);
    }



    // -----PATRON OBSERVER------

    @Override
    public void agregar(iObserver o) {
        observadores.add(o);
    }

    @Override
    public void eliminar(iObserver o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for(iObserver o : this.observadores){
            o.actualizar("Transacción completada existosmanete");
        }
    }
}
