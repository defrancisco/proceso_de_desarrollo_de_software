package clase_8.Modulo_App_Meteorologica;

public interface iObservable {
    void agregarObservador(iObserver o);
    void eliminarObservador(iObserver o);
    void notificar();
}
