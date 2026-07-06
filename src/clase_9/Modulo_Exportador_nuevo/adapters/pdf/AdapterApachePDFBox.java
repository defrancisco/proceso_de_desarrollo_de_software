package clase_9.Modulo_Exportador_nuevo.adapters.pdf;


import clase_9.Modulo_Exportador_nuevo.iExportable;

public class AdapterApachePDFBox implements AdapterExportadorPDF {
    @Override
    public String exportar(iExportable exportable) {
        // Aquí iría la lógica nativa e incómoda de Apache PDFBox
        return "Simulando exportación a PDF usando la biblioteca nativa Apache PDFBox.";
    }
}
