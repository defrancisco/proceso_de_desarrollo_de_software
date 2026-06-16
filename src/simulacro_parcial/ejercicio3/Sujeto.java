package simulacro_parcial.ejercicio3;

import simulacro_parcial.ejercicio3.Observador;

public interface Sujeto {
    void agregar(Observador o);
    void eliminar(Observador o);
    void notificar();
}
