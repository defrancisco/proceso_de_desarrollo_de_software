package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;
import ejercicio1.Poliza;

public class CoberturaContraRobo extends DecoradorCoberturas {

    public CoberturaContraRobo(Poliza poliza) {
        super(poliza);
    }

    @Override
    public double calcularPrima() {
        return poliza.calcularPrima() + 1200;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Cobertura contra Robo ";
    }
}
