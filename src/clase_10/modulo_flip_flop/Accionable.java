package clase_10.modulo_flip_flop;


// Interfaz que representa el patrón Command para las acciones pos-moderación
public interface Accionable {
    void ejecutar(Moderable moderable);
}