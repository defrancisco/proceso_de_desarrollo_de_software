package clase_7.Ejercicio_For_Sale.Entidades;

import java.util.*;

public class Empleado {
    private String nombre;
    private int cantOperacionesConcretadas = 0;
    private int cantReservas = 0;
    private List<Double> comisionesCobradas = new ArrayList<>();

    public void registrarOperacionCerrada(double comision) {
        this.cantOperacionesConcretadas++;
        this.comisionesCobradas.add(comision);
    }

    public void incrementarReservas() { this.cantReservas++; }

    public double totalComisiones() {
        return comisionesCobradas.stream().mapToDouble(Double::doubleValue).sum();
    }

    // Getters para comparaciones de "Mejor Empleado"
    public int getCantOperacionesConcretadas() { return cantOperacionesConcretadas; }
    public int getCantReservas() { return cantReservas; }
}