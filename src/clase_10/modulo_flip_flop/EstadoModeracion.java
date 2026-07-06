package clase_10.modulo_flip_flop;


import clase_10.modulo_flip_flop.observer.Accionable;

import java.util.ArrayList;
import java.util.List;

public class EstadoModeracion {
    private String nombre;
    private Condicion condicion;
    private List<Accionable> acciones; // Lista de comandos a ejecutar

    public EstadoModeracion(String nombre, Condicion condicion) {
        this.nombre = nombre;
        this.condicion = condicion;
        this.acciones = new ArrayList<>();
    }

    public void agregarAccion(Accionable accion) {
        this.acciones.add(accion);
    }

    public boolean cumpleCondicion(double resultado) {
        return condicion.cumple(resultado);
    }

    public void ejecutarAcciones(Moderable moderable) {
        System.out.println("Resultado de Moderación: " + nombre);
        for (Accionable accion : acciones) {
            accion.ejecutar(moderable);
        }
    }
}