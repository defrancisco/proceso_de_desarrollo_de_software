package clase_8.Patron_Observer_101;

public interface iObservable {
    void agregar(iObserver o);
    void eliminar(iObserver o);
    void notificar();
}
