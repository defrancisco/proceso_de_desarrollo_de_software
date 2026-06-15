package clase;

// Interfaz que representa el patrón Command para las acciones pos-moderación
public interface Accionable {
    void ejecutar(Moderable moderable);
}