package ejercicio4;

public interface iObservables {
    void addObserver(iObserver o);
    void removeObserver(iObserver o);
    void notificar();
}
