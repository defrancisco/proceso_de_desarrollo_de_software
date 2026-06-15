package clase_9.modulo_exportador;

public class ExportarAPDF implements IEstrategiaDeExportacion {
    private String nombreArchivo;
    private IAdapterExportadorAPDF adapter;

    // Se inyecta el adaptador concreto (por defecto ApachePDFBox según el modelo)
    public ExportarAPDF(String nombreArchivo, IAdapterExportadorAPDF adapter) {
        this.nombreArchivo = nombreArchivo;
        this.adapter = adapter;
    }

    @Override
    public String exportar(IExportable exportable) {
        // Delega la responsabilidad al adaptador para protegerse de cambios de librería
        String resultadoLibreria = adapter.exportar(exportable);
        return resultadoLibreria + " Guardado en: " + nombreArchivo + ".pdf";
    }
}