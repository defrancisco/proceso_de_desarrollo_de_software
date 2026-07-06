package clase_9.Modulo_Exportador_nuevo;

import clase_9.Modulo_Exportador_nuevo.adapters.pdf.AdapterApachePDFBox;
import clase_9.Modulo_Exportador_nuevo.adapters.pdf.AdapterExportadorPDF;
import clase_9.Modulo_Exportador_nuevo.strategy.ExportacionFormatoExcel;
import clase_9.Modulo_Exportador_nuevo.strategy.ExportacionFormatoPDF;
import clase_9.Modulo_Exportador_nuevo.strategy.iEstrategiadeExportacion;


public class FactoryEstrategiaDeExportacion {

    public static iEstrategiadeExportacion crearEstrategiaDeExportacion(FormatodeExportacion formatoDeExportacion, String nombreDelArchivo) {
        switch (formatoDeExportacion) {
            case EXCEL:return new ExportacionFormatoExcel(nombreDelArchivo);
            case PDF:
                AdapterApachePDFBox adapterPDF = new AdapterApachePDFBox();
                return new ExportacionFormatoPDF(nombreDelArchivo, adapterPDF);
            default:
                throw new IllegalArgumentException("Formato de exportación no soportado.");
        }
    }
}
