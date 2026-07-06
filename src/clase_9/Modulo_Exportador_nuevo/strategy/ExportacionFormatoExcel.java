package clase_9.Modulo_Exportador_nuevo.strategy;

import clase_9.Modulo_Exportador_nuevo.adapters.pdf.AdapterExportadorPDF;
import clase_9.Modulo_Exportador_nuevo.iExportable;

public class ExportacionFormatoExcel implements iEstrategiadeExportacion {
    private String nombreArchivo;


    public ExportacionFormatoExcel(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }

    @Override
    public String exportar(iExportable exportable) {

        return "Documento exportado exitosamente a Excel con Apache POI en el archivo: " + nombreArchivo;
    }
}
