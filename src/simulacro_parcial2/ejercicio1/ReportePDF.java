package simulacro_parcial2.ejercicio1;

public class ReportePDF implements Reporte {
    @Override
    public void generar(String rutaDestino) {
        System.out.println("Exportando en PDF para" + rutaDestino);
    }


}
