package simulacro_parcial2.ejercicio1;

public class GestorExportacion{
    private static GestorExportacion gestor;
    private String rutaDestino;

    private GestorExportacion(){
        this.rutaDestino = "/opt/sistema/reportes";
    }

    // Singleton: Acceso Global
    public static GestorExportacion getInstance(){
        if(gestor == null){
            gestor = new GestorExportacion();
        }
        return gestor;
    }

    // Factory Method
    public Reporte crearReporte(String tipo){
        switch (tipo){
            case "PDF":
                return new ReportePDF();
            case "CSV":
                return new ReporteCSV();
            default:
                throw new IllegalArgumentException("Formato de exportación no soportado.");
        }

    }

    public void exportar(String tipo){
      Reporte reporte = crearReporte(tipo);
      reporte.generar(this.rutaDestino);
    }
}
