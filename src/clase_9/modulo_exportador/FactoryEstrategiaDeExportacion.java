package clase_9.modulo_exportador;

public class FactoryEstrategiaDeExportacion {

    public static IEstrategiaDeExportacion crearEstrategia(FormatoDeExportacion formatoDeExportacion, String nombreDelArchivo) {
        switch (formatoDeExportacion) {
            case EXCEL:
                return new ExportarAExcel(nombreDelArchivo);
            case PDF:
                // Instancia el adaptador requerido por el constructor de ExportarAPDF
                IAdapterExportadorAPDF adapterPDF = new AdapterApachePDFBox();
                return new ExportarAPDF(nombreDelArchivo, adapterPDF);
            default:
                throw new IllegalArgumentException("Formato de exportación no soportado.");
        }
    }
}
