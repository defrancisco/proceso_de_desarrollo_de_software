package clase_10.modulo_exportador_facade.strategy;

import clase_10.modulo_exportador_facade.IExportable;

public class ExportarAExcel implements IEstrategiaDeExportacion {
    private String nombreArchivo;

    public ExportarAExcel(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String exportar(IExportable exportable) {
        // Aquí iría la lógica interna interactuando con Apache POI
        return "Documento exportado exitosamente a Excel con Apache POI en el archivo: " + nombreArchivo;
    }
}