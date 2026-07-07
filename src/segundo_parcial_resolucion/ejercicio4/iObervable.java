package segundo_parcial_resolucion.ejercicio4;

public interface iObervable {
    void agregar(iObserver o);
    void eliminar(iObserver o);
    void notificar();
}
