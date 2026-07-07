package simulacro_parcial2.ejercicio1;

import jdk.javadoc.doclet.Reporter;

public class ReporteCSV implements Reporte {

    @Override
    public void generar(String rutaDestino) {
        System.out.println("Exportando en CSV para" + rutaDestino);
    }
}
