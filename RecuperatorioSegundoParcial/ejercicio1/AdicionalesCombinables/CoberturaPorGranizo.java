package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;

public class CoberturaPorGranizo extends DecoradorCoberturas {


    @Override
    public double calcularPrima() {
        return poliza.calcularPrima() + 800;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Cobertura por Granizo";
    }
}
