package clase_11.simulacro_segundo_parcial.ejercicio1.composite;

import clase_11.simulacro_segundo_parcial.ejercicio1.iPaquete;

public class PaqueteIndividual implements iPaquete {
    private double peso;
    private double costoBase;

    public PaqueteIndividual(double peso, double costoBase) {
        this.peso = peso;
        this.costoBase = costoBase;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getCosto() {
        return costoBase;
    }
}
