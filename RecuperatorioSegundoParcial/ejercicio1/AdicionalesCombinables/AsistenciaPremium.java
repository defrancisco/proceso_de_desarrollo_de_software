package ejercicio1.AdicionalesCombinables;

import ejercicio1.DecoradorCoberturas;
import ejercicio1.Poliza;

public class AsistenciaPremium extends DecoradorCoberturas {

    public AsistenciaPremium(Poliza poliza){
        super(poliza);
    }


    @Override
    public double calcularPrima() {
        // CORRECCIÓN: Se multiplica por 1.10 para aplicar un 10% sobre el subtotal acumulado
        return super.calcularPrima() * 1.10;
    }

    @Override
    public String descripcion() {
        return poliza.descripcion() + " + Asistencia Premium";
    }
}
