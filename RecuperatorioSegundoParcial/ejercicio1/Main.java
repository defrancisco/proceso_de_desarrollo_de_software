package ejercicio1;

import ejercicio1.AdicionalesCombinables.AsistenciaPremium;
import ejercicio1.AdicionalesCombinables.CoberturaContraRobo;
import ejercicio1.AdicionalesCombinables.CoberturaPorGranizo;

public class Main {
    public static void main(String[] args) {

        Poliza polizaBase = new ResponsabilidadCivil();

        Poliza polizaRobo = new CoberturaContraRobo(polizaBase);

        Poliza polizaRoboGranizo = new CoberturaPorGranizo(polizaRobo);

        Poliza polizaCompleta = new AsistenciaPremium(polizaRoboGranizo);

        // Mostrar resultados
        System.out.println(polizaBase.descripcion() + " → Prima: $" + polizaBase.calcularPrima());
        System.out.println(polizaRobo.descripcion() + " → Prima: $" + polizaRobo.calcularPrima());
        System.out.println(polizaRoboGranizo.descripcion() + " → Prima: $" + polizaRoboGranizo.calcularPrima());
        System.out.println(polizaCompleta.descripcion() + " → Prima: $" + polizaCompleta.calcularPrima());


    }
}
