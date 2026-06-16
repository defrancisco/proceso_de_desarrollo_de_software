package simulacro_parcial.ejercicio3;

import simulacro_parcial.ejercicio3.Observador;
import ejercicio3.Sujeto;

import java.util.ArrayList;
import java.util.List;

public class Estacion implements Sujeto {
    private List<Observador> observadores = new ArrayList<Observador>();
    private float marea;

    public Estacion(float marea) {
        this.marea = marea;
    }

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for  (Observador o : observadores) {
            o.actualizar(marea);
        }
    }

    public void setMarea(float nuevaAltura) {
        marea = nuevaAltura;
        notificar();
    }
}
