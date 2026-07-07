package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;

public class CoberturaContraRobo extends DecoradorCoberturas {

    @Override
    public double calcularPrima() {
        return poliza.calcularPrima() + 1200;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Cobertura contra Robo ";
    }
}
