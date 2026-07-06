package clase_9.Modulo_Exportador_nuevo.strategy;

import clase_9.Modulo_Exportador_nuevo.adapters.pdf.AdapterApachePDFBox;
import clase_9.Modulo_Exportador_nuevo.iExportable;

public class ExportacionFormatoPDF implements iEstrategiadeExportacion {
    private String nombreArchivo;
    AdapterApachePDFBox adapterPDF;

    public ExportacionFormatoPDF(String nombreArchivo, AdapterApachePDFBox adapterPDF) {
        this.nombreArchivo = nombreArchivo;
        this.adapterPDF = adapterPDF;
    }
    @Override
    public String exportar(iExportable exportable) {
        //tranformo mi archivo por medio del adapter
        String resultadoLibreria = adapterPDF.exportar(exportable);
        return resultadoLibreria + " Guardado en: " + nombreArchivo + ".pdf";
    }
}
