package clase_10.modulo_exportador_facade;

import clase_10.modulo_exportador_facade.adapter.AdapterApachePDFBox;
import clase_10.modulo_exportador_facade.adapter.IAdapterExportadorAPDF;
import clase_10.modulo_exportador_facade.strategy.ExportarAExcel;
import clase_10.modulo_exportador_facade.strategy.ExportarAPDF;
import clase_10.modulo_exportador_facade.strategy.IEstrategiaDeExportacion;

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
