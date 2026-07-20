package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;
import ejercicio1.Poliza;

public class CoberturaPorGranizo extends DecoradorCoberturas {


    public CoberturaPorGranizo(Poliza poliza) {
        super(poliza);
    }

    @Override
    public double calcularPrima() {
        return poliza.calcularPrima() + 800;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Cobertura por Granizo";
    }
}
