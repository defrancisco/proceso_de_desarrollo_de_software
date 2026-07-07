package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;

public class AsistenciaPremium extends DecoradorCoberturas {


    @Override
    public double calcularPrima() {

        return poliza.calcularPrima() * 10;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Asistencia Premium";
    }
}
