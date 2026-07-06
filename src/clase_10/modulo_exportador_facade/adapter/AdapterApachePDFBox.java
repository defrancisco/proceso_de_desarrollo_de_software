package clase_10.modulo_exportador_facade.adapter;

import clase_10.modulo_exportador_facade.IExportable;

public class AdapterApachePDFBox implements IAdapterExportadorAPDF {
    @Override
    public String exportar(IExportable exportable) {
        // Aquí iría la lógica nativa e incómoda de Apache PDFBox
        return "Simulando exportación a PDF usando la biblioteca nativa Apache PDFBox.";
    }
}
